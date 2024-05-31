// Made by Mónica Gómez (Autumn64)
#include<stdio.h>
#include<stdlib.h>

#define forever for(;;)

int main(void){
    char c;
    int n, index;
    float *v1, *v2;
    
    printf("Introduce la cantidad de calificaciones: ");
    scanf("%d", &n);
    
    v1 = malloc(sizeof(float) * n);
    v2 = malloc(sizeof(float) * n);
    
    if (!v1 || !v2){
        perror("Error al asignar memoria!");
        return 1;
    }
    
    for (int i = 0; i < n; i++){
        printf("Introduce la calificacion #%d del array 1: ", i + 1);
        scanf("%f", &v1[i]);
    }
    
    for (int i = 0; i < n; i++){
        printf("Introduce la calificacion #%d del array 2: ", i + 1);
        scanf("%f", &v2[i]);
    }
    
    forever{
        printf("Escoja el promedio que quiere ver (1 - %d): ", n);
        scanf("%d", &index);
        
        printf("El promedio entre %.2f y %.2f es %.2f\n", v1[index - 1], v2[index - 1], ((v1[index - 1] + v2[index -1])/2.0));
        printf("Desea salir? (S/n): ");
        getchar();
        scanf("%c", &c);
        getchar();
        
        if(c == 'S' || c == 's'){
            break;
        }
    }
    
    free(v1);
    free(v2);
    
    return 0;
}
