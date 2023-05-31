import Banner from "./Banner";

export async function getBanners() {
    const url = "http://168.194.207.98:8081/api_banner/get_banners.php";
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

export async function getBannerById(id: number) {
    const url = "http://168.194.207.98:8081/api_banner/get_banner.php?id=" + id;
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

export async function saveBanner(banner: Banner) {
    console.log(banner);
    let url = 'http://168.194.207.98:8081/api_banner/post_banner.php';
    let method = "POST";
    if (banner && banner.id > 0) {
        url = 'http://168.194.207.98:8081/api_banner/put_banner.php';
        method = "PUT";
    }
    await fetch(url, {
        "method": method,
        "body": JSON.stringify(banner),
        "headers": {
            "Content-Type": 'application/json'
        }
    });
}

export async function deleteBanner(id: number) {
    const url = 'http://168.194.207.98:8081/api_banner/delete_banner.php?id=' + id;
    await fetch(url, {
        method: 'GET',
        headers: {
            'Content-type': 'application/json',
            'Access-Control-Allow-Origin': '*'
        },
        mode: 'cors'
    });
}