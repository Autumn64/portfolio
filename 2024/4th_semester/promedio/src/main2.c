// Made by Mónica Gómez (Autumn64).
#include <stdio.h>

int main(){
		float acum = 0;
		int n, opcion;
		char salir;

		printf("Dame el número de calificaciones: ");
		scanf("%d", &n);

		float t_calif[n];

		for (int i = 0; i < n; i++){
				printf("Dame la calificación %d: ", i + 1);
				scanf("%f", &t_calif[i]);

				acum += t_calif[i];
		}

		printf("\nEl promedio es: %.3f\n", acum/(float) n);

		for(;;){
			printf("\nHay %d calificaciones disponibles, escoja cuál quiere ver (1 - %d): ", n, n);
			scanf("%d", &opcion);

			if(opcion > n){
					printf("ERROR: La calificación %d no existe.\n", opcion);
					continue;
			}

			printf("La calificación %d es %.2f.\n", opcion, t_calif[opcion - 1]);
			getchar();

			printf("\n¿Desea salir? (s/n): ");
			scanf("%c", &salir);

			if (salir == 's') break;

		}
		return 0;		
}
