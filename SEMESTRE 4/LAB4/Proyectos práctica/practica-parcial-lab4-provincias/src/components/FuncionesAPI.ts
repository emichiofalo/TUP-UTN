import Provincia from "./Provincia";

export async function getProvinces() {
    const url = "http://168.194.207.98:8081/api_provincia/get_provincias.php";
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

export async function getProvinceByName(name: string) {
    const url = "http://168.194.207.98:8081/api_provincia/get_provincias.php?nombre=" + name;
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

export async function getProvinceById(id: number) {
    const url = "http://168.194.207.98:8081/api_provincia/get_provincia.php?id=" + id;
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

export async function saveProvince(provincia: Provincia) {
    let url = 'http://168.194.207.98:8081/api_provincia/post_provincia.php';
    let method = "POST";
    if (provincia && provincia.id > 0) {
        url = 'http://168.194.207.98:8081/api_provincia/put_provincia.php';
        method = "PUT";
    }
    const response = await fetch(url, {
        "method": method,
        "body": JSON.stringify(provincia),
        "headers": {
            "Content-Type": 'application/json'
        }
    });
    return response;
}

export async function deleteProvince(id: number) {
    const url = 'http://168.194.207.98:8081/api_provincia/delete_provincia.php?id=' + id;
    await fetch(url, {
        method: 'GET',
        headers: {
            'Content-type': 'application/json',
            'Access-Control-Allow-Origin': '*'
        },
        mode: 'cors'
    });
}