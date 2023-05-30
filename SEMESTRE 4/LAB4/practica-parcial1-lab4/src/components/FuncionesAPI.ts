import Contacto from "./Contacto";

export async function getContacts() {
    const url = "http://168.194.207.98:8081/api_contacto/get_contactos.php";
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

export async function getContactByLetter(letter: string) {
    const url = "http://168.194.207.98:8081/api_contacto/get_contactos.php?indice=" + letter;
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

export async function saveContact(contacto?: Contacto) {
    let url = 'http://168.194.207.98:8081/api_contacto/post_contacto.php';
    let method = "POST";
    if (contacto && contacto.id > 0) {
        url = 'http://168.194.207.98:8081/api_contacto/put_contacto.php';
        method = "PUT";
    }
    await fetch(url, {
        "method": method,
        "body": JSON.stringify(contacto),
        "headers": {
            "Content-Type": 'application/json'
        }
    });
}

export async function deleteContact(id: number) {

    const url = 'http://168.194.207.98:8081/api_contacto/delete_contacto.php?id=' + id;
    await fetch(url, {
        method: 'GET',
        headers: {
            'Content-type': 'application/json',
            'Access-Control-Allow-Origin': '*'
        },
        mode: 'cors'
    });
}
