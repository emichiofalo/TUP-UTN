const express = require('express');
const app = express();
const bodyParser = require('body-parser');

// SDK de Mercado Pago
const mercadopago = require ('mercadopago');

//middleware

app.use(bodyParser.urlencoded({ extended: false }))

// Agrega credenciales
mercadopago.configure({
    access_token: 'TEST-7915539618719448-050900-37d558bd1d32a29b86380a65a73094df-96867950'
  });

//routes
app.post('/checkout', (req, res) => {
// Crea un objeto de preferencia

let preference = {
    back_urls: {
      success: "https://localhost/MercadoPago/success.html",
      failure: "https://localhost/MercadoPago/failure.html",
      pending: "https://localhost/MercadoPago/pending.html"
    },
    auto_return: "approved",
    external_reference: "1800",
    items: [
      {
        title:req.body.title,
        description: req.body.description,
        unit_price: parseFloat(req.body.price),
        quantity: 1,
      }
    ]
  };
  
  mercadopago.preferences.create(preference)
  .then(function(response){
    console.log(response.body);
    res.redirect(response.body.init_point);
   
  }).catch(function(error){
    console.log(error);
  });
});




//server

app.listen(3000, () => {
    console.log("Server on port 3000");
});
