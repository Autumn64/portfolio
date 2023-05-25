//Autores: Arenas Sánchez Jorge Alejandro, Flores Gómez Aurora Giselle.
#include <iostream>
#include <cstdlib> //Para system("pause") y system("cls")
#include <windows.h> //Necesario para trabajar con Sleep.
#include <string> //Por favor, los char arrays son terribles lol.
#include <vector> /*Utilizar un array estático de structs limitaría la cantidad de estudiantes que pueden agregarse. Hicimos pruebas para usar
                    un array dinámico y funciona bien en C, pero está literalmente roto en C++, por lo que la alternativa más sensata y eficiente
                    es usar un vector en donde los structs de cada estudiante se guarden en cada espacio de éste.*/
using namespace std;

struct Estudiante {
	string matricula, nombre, app, apm, carrera, correo, telefono;
};

void menu(vector<Estudiante>& estudiantes);
void adds(vector<Estudiante>& estudiantes);
void rems(vector<Estudiante>& estudiantes);
void modf(vector<Estudiante>& estudiantes);
void search(vector<Estudiante>& estudiantes);
void shwa(vector<Estudiante>& estudiantes);

const char* texto[] = { " estudiante registrado.\n", " estudiantes registrados.\n" }; //Sólo puse esto por payasa.

void intro(){
	cout << "\n\n\n\n\n\n\n\n\n\n";
	cout << "                                    Administracion de alumnos" << endl;
	Sleep(1000);
	cout << "                                             .";
	for(int i=1; i<5; i++){
		Sleep(1000);
		cout << ".";
	}
	Sleep(2000);
}

void menu(vector<Estudiante>& estudiantes) {
	char o;
	system("cls");
	Sleep(2000);
	cout << " ******** ADMINISTRACION DE ESTUDIANTES 1.0 ***********\n";
	if (estudiantes.size() == 1) {
		cout << " Actualmente hay " << estudiantes.size() << texto[0] << endl;
	}
	else {
		cout << " Actualmente hay " << estudiantes.size() << texto[1] << endl;
	}
	cout << " 1. Alta de estudiantes." << endl;
	cout << " 2. Baja de estudiantes." << endl;
	cout << " 3. Modificaciones de estudiantes." << endl;
	cout << " 4. Mostrar todos." << endl;
	cout << " 5. Busqueda de estudiantes." << endl;
	cout << " 6. Salir.";
	cout << "\n\n\n\n\n\n\n";
	cout << " Arenas Sanchez Jorge Alejandro, Flores Gomez Aurora Giselle. 2023. \x1b[A\x1b[A\x1b[A\x1b[A\x1b[A\x1b[A\x1b[A";
	//Ese bonche de simbolos raros son secuencias de escape para mandar el cursor hacia arriba y que "Escoja una opcion" quede en medio.
	cout << "\n\n Escoja una opcion (1-6): ";
	cin >> o;
	cin.ignore(1, '\n'); //cin deja un salto de linea en el flujo de entrada, lo cual crea problemas en el resto del código.
	switch (o) {
		case '1':
			adds(estudiantes);
			break;
		case '2':
			rems(estudiantes);
			break;
		case '3':
			modf(estudiantes);
			break;
		case '4':
			shwa(estudiantes);
			break;
		case '5':
			search(estudiantes);
			break;
		case '6':
			cout << "\n Saliendo";
			for (int i = 1; i < 6; i++) {
				Sleep(500);
				cout << ".";
			}
			Sleep(2000);
			exit(0);
			break;
		default:
			menu(estudiantes);
			break;
	}
}

int main()
{
	vector <Estudiante> estudiantes; //Vector donde se van a guardar todos los alumnos.
	intro();
	do{
		menu(estudiantes);
	} while (true); //El programa regresará indefinidamente al menú principal hasta que se use la opción 6.
	return 0;
}

void adds(vector<Estudiante>& estudiantes) { //ADD Student.
	// El & es para poder modificar el vector directamente sin tener que liarnos con punteros.
	char op;
	system("cls");
	Sleep(2000);
	Estudiante nestudiante; //struct temporal para guardar los datos del estudiante.
	cout << "Ingrese la matricula del estudiante: ";
	getline(cin, nestudiante.matricula); //cin deja de leer el flujo de entrada cuando se topa con un espacio.
	for (int i = 0; i < estudiantes.size(); i++) {
		if (nestudiante.matricula == estudiantes[i].matricula) {
			cout << "\nYa existe un estudiante con esa matricula. Si desea modificar un estudiante, dirijase a la opcion 3 del menu principal." << endl;
			system("pause");
			return;
		}
	}
	cout << "Ingrese el nombre del estudiante: ";
	getline(cin, nestudiante.nombre);
	cout << "Ingrese el apellido paterno del estudiante: ";
	getline(cin, nestudiante.app);
	cout << "Ingrese el apellido materno del estudiante: ";
	getline(cin, nestudiante.apm);
	cout << "Ingrese la carrera del estudiante: ";
	getline(cin, nestudiante.carrera);
	cout << "Ingrese el correo electronico del estudiante: ";
	getline(cin, nestudiante.correo);
	cout << "Ingrese el numero de telefono del estudiante: ";
	getline(cin, nestudiante.telefono);
	cout << "\nSe agregara el siguiente estudiante:" << endl;
	cout << "Matricula: " << nestudiante.matricula << endl;
	cout << "Nombre: " << nestudiante.nombre << endl;
	cout << "Apellido paterno: " << nestudiante.app << endl;
	cout << "Apellido materno: " << nestudiante.apm << endl;
	cout << "Carrera: " << nestudiante.carrera << endl;
	cout << "Correo electronico: " << nestudiante.correo << endl;
	cout << "Numero de telefono: " << nestudiante.telefono << endl;
	cout << "\nDesea continuar? (s/n): ";
	cin >> op;
	cin.ignore(1, '\n');
	if (op == 's') {
		estudiantes.push_back(nestudiante); //Agregamos los valores al final del vector principal.
		Sleep(500);
		cout << "\nEstudiante agregado exitosamente." << endl;
	}
	else {
		cout << "\nOperacion cancelada." << endl;
	}
	system("pause");
	return;
}

void rems(vector<Estudiante>& estudiantes) { //REMove Student.
	char op;
	string matricula;
	system("cls");
	Sleep(2000);
	cout << "Ingrese la matricula del estudiante que desea eliminar: ";
	getline(cin, matricula);
	for (int i = 0; i < estudiantes.size(); i++) {
		if (matricula == estudiantes[i].matricula) {
			cout << "\nSe encontro el siguiente estudiante:" << endl;
			cout << "Matricula: " << estudiantes[i].matricula << endl;
			cout << "Nombre: " << estudiantes[i].nombre << endl;
			cout << "Apellido paterno: " << estudiantes[i].app << endl;
			cout << "Apellido materno: " << estudiantes[i].apm << endl;
			cout << "Carrera: " << estudiantes[i].carrera << endl;
			cout << "Correo electronico: " << estudiantes[i].correo << endl;
			cout << "Numero de telefono: " << estudiantes[i].telefono << endl;
			cout << "\nDesea eliminarlo? (s/n): ";
			cin >> op;
			cin.ignore(1, '\n');
			if (op == 's') {
				estudiantes.erase(estudiantes.begin() + i); /*Inicio del vector + el valor de i para borrar ese struct especifico del vector.
															El vector se reacomoda automaticamente al borrar un valor de en medio.*/
				Sleep(500);
				cout << "\nEstudiante eliminado exitosamente." << endl;
			}
			else {
				cout << "\nOperacion cancelada." << endl;
			}
			system("pause");
			return;
		}
	}
	cout << "\nNo se encontro ningun estudiante con esa matricula, volviendo al menu principal." << endl;
	system("pause");
	return;
}

void shwa(vector<Estudiante>& estudiantes) { //SHoW All
	system("cls");
	Sleep(2000);
	cout << "\n                                       TODOS LOS ESTUDIANTES" << endl;
	if (estudiantes.size() < 1) {
		cout << "\n\n                                     No hay datos para mostrar." << endl;
		cout << endl;
	}
	else {
		for (int i = 0; i < estudiantes.size(); i++) {
			cout << "\n----------------------------------------------" << endl;
			cout << "Matricula: " << estudiantes[i].matricula << endl;
			cout << "Nombre: " << estudiantes[i].nombre << endl;
			cout << "Apellido paterno: " << estudiantes[i].app << endl;
			cout << "Apellido materno: " << estudiantes[i].apm << endl;
			cout << "Carrera: " << estudiantes[i].carrera << endl;
			cout << "Correo electronico: " << estudiantes[i].correo << endl;
			cout << "Numero de telefono: " << estudiantes[i].telefono << endl;
		}
	}
	cout << endl;
	system("pause");
	return;
}

void modf(vector<Estudiante>& estudiantes) { //MODiFy
	char op;
	string matricula;
	system("cls");
	Sleep(2000);
	cout << "Ingrese la matricula del estudiante que desea modificar: ";
	getline(cin, matricula);
	for (int i = 0; i < estudiantes.size(); i++) {
		if (matricula == estudiantes[i].matricula) {
			cout << "\nSe encontro el siguiente estudiante:" << endl;
			cout << "Matricula: " << estudiantes[i].matricula << endl;
			cout << "Nombre: " << estudiantes[i].nombre << endl;
			cout << "Apellido paterno: " << estudiantes[i].app << endl;
			cout << "Apellido materno: " << estudiantes[i].apm << endl;
			cout << "Carrera: " << estudiantes[i].carrera << endl;
			cout << "Correo electronico: " << estudiantes[i].correo << endl;
			cout << "Numero de telefono: " << estudiantes[i].telefono << endl;
			cout << "\nDesea modificarlo? (s/n): ";
			cin >> op;
			cin.ignore(1, '\n');
			if (op == 's') {
				cout << "\n\nIngrese la nueva matricula: ";
				getline(cin, estudiantes[i].matricula);
				cout << "Ingrese el nuevo nombre: ";
				getline(cin, estudiantes[i].nombre);
				cout << "Ingrese el nuevo apellido paterno: ";
				getline(cin, estudiantes[i].app);
				cout << "Ingrese el nuevo apellido materno: ";
				getline(cin, estudiantes[i].apm);
				cout << "Ingrese la nueva carrera: ";
				getline(cin, estudiantes[i].carrera);
				cout << "Ingrese el nuevo correo electronico: ";
				getline(cin, estudiantes[i].correo);
				cout << "Ingrese el nuevo numero de telefono: ";
				getline(cin, estudiantes[i].telefono);
				cout << "\nEstudiante modificado exitosamente." << endl;
				system("pause");
				return;
			}
			else {
				cout << "\nOperacion cancelada." << endl;
			}
			system("pause");
			return;
		}
	}
	cout << "\nNo se encontro ningun estudiante con esa matricula, volviendo al menu principal." << endl;
	system("pause");
	return;
}

void search(vector<Estudiante>& estudiantes) {
	string matricula;
	system("cls");
	Sleep(2000);
	cout << "Ingrese la matricula del estudiante que desea buscar: ";
	getline(cin, matricula);
	for (int i = 0; i < estudiantes.size(); i++) {
		if (matricula == estudiantes[i].matricula) {
			cout << "\nSe encontro el siguiente estudiante:" << endl;
			cout << "Matricula: " << estudiantes[i].matricula << endl;
			cout << "Nombre: " << estudiantes[i].nombre << endl;
			cout << "Apellido paterno: " << estudiantes[i].app << endl;
			cout << "Apellido materno: " << estudiantes[i].apm << endl;
			cout << "Carrera: " << estudiantes[i].carrera << endl;
			cout << "Correo electronico: " << estudiantes[i].correo << endl;
			cout << "Numero de telefono: " << estudiantes[i].telefono << endl << endl;
			system("pause");
			return;
		}
	}
	cout << "\nNo se encontro ningun estudiante con esa matricula, volviendo al menu principal." << endl;
	system("pause");
	return;
}