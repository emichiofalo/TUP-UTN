"use strict";
class FiguraGeometrica {
    constructor(base, altura) {
        this.base = base;
        this.altura = altura;
    }
    calcularArea() {
        return this.base * this.altura;
    }
}
class Rectangulo extends FiguraGeometrica {
    constructor(base, altura) {
        super(base, altura);
    }
    calcularArea() {
        return this.base * this.altura;
    }
}
class Triangulo extends FiguraGeometrica {
    constructor(base, altura) {
        super(base, altura);
    }
    calcularArea() {
        return (this.base * this.altura) / 2;
    }
}
