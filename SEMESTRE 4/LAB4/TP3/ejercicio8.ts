//import fetch from 'node-fetch';
import fetch from 'isomorphic-fetch';


interface Cerveza {
  id: number;
  uid: string;
  brand: string;
  name: string;
  style: string;
  hop: string;
  yeast: string;
  malts: string;
  ibu: string;
  alcohol: string;
  blg: string;
}

const url = 'https://random-data-api.com/api/beer/random_beer?size=55';

const cargarCervezas = (async () => {
  try {
    const response = await fetch(url);
    const data = await response.json();

    const cervezas: Cerveza[] = (data as any[]).map((item: any) => {
      return {
        id: item.id,
        uid: item.uid,
        brand: item.brand,
        name: item.name,
        style: item.style,
        hop: item.hop,
        yeast: item.yeast,
        malts: item.malts,
        ibu: item.ibu,
        alcohol: item.alcohol,
        blg: item.blg,
      };
    });

    cervezas.forEach(cerveza => {
        console.log(`
        Marca: ${cerveza.brand}  
        Nombre: ${cerveza.name}
        Estilo: ${cerveza.style}
        IBU: ${cerveza.ibu}
        Alcohol: ${cerveza.alcohol}
        --------------------------------------------------`);
      });
  } catch (error) {
    console.error(error);
  }
})();
