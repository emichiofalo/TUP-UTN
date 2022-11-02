import { Articulo } from "./Articulo";
import { Cliente } from "./Cliente";
import { DetalleFactura } from "./DetalleFactura";
import { Factura } from "./Factura";

var c1 = new Cliente(1234, "Pepe Honguito", 27201172907);

var a1 = new Articulo(1, "Salchicha x12", 300, "unidad");
var a2 = new Articulo(2, "Pan Pancho x6", 150, "unidad");
var a3 = new Articulo(3, "Papas Pay x150gr", 200, "unidad");
var a4 = new Articulo(4, "Ketchup x100gr", 80, "unidad");
var a5 = new Articulo(5, "Pepinillos x250gr", 100, "unidad");

var f1 = new Factura("C", 23, 50, "E", new Date(122, 10, 29, 18, 26, 40, 30));
var df1 = new DetalleFactura(1, a1);
var df2 = new DetalleFactura(2, a2);
var df3 = new DetalleFactura(1, a3);
var df4 = new DetalleFactura(1, a4);
var df5 = new DetalleFactura(1, a5);
f1.addDetalle(df1);
f1.addDetalle(df2);
f1.addDetalle(df3);
f1.addDetalle(df4);
f1.addDetalle(df5);
f1.calcularTotalItems();
f1.calcularTotalFinal();
c1.addFactura(f1);

var f2 = new Factura("C", 234, 50, "TD", new Date(122, 11, 29, 18, 26, 40, 30));
df1 = new DetalleFactura(2, a1);
df2 = new DetalleFactura(4, a2);
df3 = new DetalleFactura(2, a3);
df4 = new DetalleFactura(2, a4);
df5 = new DetalleFactura(1, a5);
f2.addDetalle(df1);
f2.addDetalle(df2);
f2.addDetalle(df3);
f2.addDetalle(df4);
f2.addDetalle(df5);
f2.calcularTotalItems();
f2.calcularTotalFinal();
c1.addFactura(f2);

var f3 = new Factura("C", 4425, 50, "TD", new Date(122, 12, 29, 18, 26, 40, 30));
df1 = new DetalleFactura(3, a1);
df2 = new DetalleFactura(6, a2);
df3 = new DetalleFactura(3, a3);
df4 = new DetalleFactura(2, a4);
df5 = new DetalleFactura(2, a5);
f3.addDetalle(df1);
f3.addDetalle(df2);
f3.addDetalle(df3);
f3.addDetalle(df4);
f3.addDetalle(df5);
f3.calcularTotalItems();
f3.calcularTotalFinal();
c1.addFactura(f3);

c1.facturas.forEach(f => {
    console.log("-------------------" + "\n" +
        "Factura " + f.letra + "\n" +
        "Nro factura: " + f.numero + "\n" +
        "Fecha: " + f.fecha + "\n" +
        "Recargo: " + f.recargo + "\n" +
        "Tipo pago: " + f.tipoPago);
    f.detalles.forEach(d => {
        console.log("-------------------" + "\n" +
            "Articulo: " + d.articulo.denominacion + "\n" +
            "Cantidad: " + d.cantidad + "\n" +
            "Precio: " + d.articulo.precio + "\n" +
            "Subtotal: " + d.subtotal);
    });
    console.log("-------------------" + "\n" +
        "Total items: " + f.totalItems + "\n" +
        "Total final: " + f.totalFinal + "\n" +
        "-------------------");
});

console.log("Total pagos en efectivo: " + c1.totalFacturadoXTipoPago("E"));
console.log("Total pagos tarjeta débito: " + c1.totalFacturadoXTipoPago("TD"));