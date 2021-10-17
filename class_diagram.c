#include <stdio.h>
#include <string.h>
#include <stdlib.h>

enum Constants{NAME_LEN = 20, 
               VARIABLE_LEN = 20, 
               VARIABLES_SIZE = 10, 
               METHOD_LEN = 20, 
               METHODS_SIZE = 10};


typedef struct 
{
    char name[NAME_LEN];
    //char* variables = (char*) calloc(VARIABLES_SIZE, VARIABLE_LEN * sizeof(char));
    char variables[VARIABLES_SIZE][VARIABLE_LEN];
    //char* methods = (char*) calloc(METHODS_SIZE, METHOD_LEN * sizeof(char));
    char methods[VARIABLES_SIZE][METHOD_LEN];

} ClassDiagram;


void createClass();
void printClass();

int main() 
{
    printf("Create a class diagram\n");
    createClass();

    //free(variables);
    //free(methods);

    return 0;
}

void createClass()
{
    ClassDiagram newClass;
    int index = 0;

    printf("What is the name of your class\n");
    scanf("%s", newClass.name);

    do {
        printf("Write a name for a variable ('end' to end)\n");
        scanf("%s", newClass.variables[index]);

        if (strcmp(newClass.variables[index],"end") == 0) {
            index = 0;
        } else {
            index++;
        }

    } while (index > 0);

    do {
        printf("Write a name for a method ('end' to end)\n");
        scanf("%s", newClass.methods[index]);

        if (strcmp(newClass.methods[index],"end") == 0) {
            index = 0;
        } else {
            index++;
        }

    } while (index > 0);


    printf("\n");


    for (int i = 0; i < sizeof(newClass.variables)/sizeof(newClass.variables[i]); i++)
        printf("%d  >>>  %s\n", i, newClass.variables[i]);

    printf("\n");

    for (int i = 0; i < sizeof(newClass.methods)/sizeof(newClass.methods[i]); i++)
        printf("%s\n", newClass.methods[i]);

}