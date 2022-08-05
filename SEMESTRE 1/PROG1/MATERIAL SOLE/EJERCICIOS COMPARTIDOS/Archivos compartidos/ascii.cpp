#include <iostream>
using namespace std;

int main() {
	int ascii;
	cout << "Codigo ASCII? ";
	cin >> ascii;
	cout << "El codigo " << ascii << " es el caracter '";
	cout << char(ascii) << "'" << endl;
}
