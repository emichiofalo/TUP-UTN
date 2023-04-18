class FiguraGeometrica {
    protected base: number;
    protected altura: number;
  
    constructor(base: number, altura: number) {
        this.base = base;
        this.altura = altura;
    }
  
    calcularArea(): number {
        return this.base * this.altura;
    }
  }

class Rectangulo extends FiguraGeometrica {
    constructor(base: number, altura: number) {
        super(base, altura);
    }

    calcularArea(): number {
        return this.base * this.altura;
    }
}

class Triangulo extends FiguraGeometrica {
    constructor(base: number, altura: number) {
        super(base, altura);
    }

    calcularArea(): number {
        return (this.base * this.altura) / 2;
    }
}
