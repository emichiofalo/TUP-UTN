import { Articulo } from "./Modelo/Articulo";

export async function getCategories() {
    const url = "http://168.194.207.98:8081/api_articulo/get_rubros.php";
    const response = await fetch(url, {
        method: 'GET',
        headers: {
            'Content-type': 'application/json',
            'Access-Control-Allow-Origin': '*'
        },
        mode: 'cors'
    });
    return await response.json();
}

export async function getProductsByCategory(idcategory: number) {
    const url = "http://168.194.207.98:8081/api_articulo/get_articulos_por_rubro.php?idrubro=" + idcategory;
    const response = await fetch(url, {
        method: 'GET',
        headers: {
            'Content-type': 'application/json',
            'Access-Control-Allow-Origin': '*'
        },
        mode: 'cors'
    });
    return await response.json();
}

export async function getProductById(idproduct: number) {
    const url = "http://168.194.207.98:8081/api_articulo/get_articulo.php?id=" + idproduct;
    const response = await fetch(url, {
        method: 'GET',
        headers: {
            'Content-type': 'application/json',
            'Access-Control-Allow-Origin': '*'
        },
        mode: 'cors'
    });
    return await response.json();
}

export async function getProductByCode(code: string) {
    const url = "http://168.194.207.98:8081/api_articulo/get_articulos_por_codigo.php?codigo=" + code;
    const response = await fetch(url, {
        method: 'GET',
        headers: {
            'Content-type': 'application/json',
            'Access-Control-Allow-Origin': '*'
        },
        mode: 'cors'
    });
    return await response.json();
}

export async function saveProduct(articulo: Articulo) {
    let url = 'http://168.194.207.98:8081/api_articulo/post_articulo.php';
    let method = "POST";
    if (articulo && articulo.id > 0) {
        url = 'http://168.194.207.98:8081/api_articulo/put_articulo.php';
        method = "PUT";
    }
    await fetch(url, {
        "method": method,
        "body": JSON.stringify(articulo),
        "headers": {
            "Content-Type": 'application/json'
        }
    });
}

export async function deleteProduct(id: number) {
    const url = 'http://168.194.207.98:8081/api_articulo/delete_articulo.php?id=' + id;
    await fetch(url, {
        method: 'GET',
        headers: {
            'Content-type': 'application/json',
            'Access-Control-Allow-Origin': '*'
        },
        mode: 'cors'
    });
}