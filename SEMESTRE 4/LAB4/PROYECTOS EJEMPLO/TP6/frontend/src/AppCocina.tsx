import React, { Component, Suspense } from 'react';
import './App.css';
import { Contador } from './componentes/Contador';
import { Route, BrowserRouter as Router, Routes } from 'react-router-dom';
import App from './App';
import { Home } from './componentes/Home';
import { DetallePlato } from './componentes/DetallePlato';
import { GrillaPlatos } from './componentes/GrillaPlatos';
import { FrmPlato } from './componentes/FrmPlato';


class AppCocina extends Component{
  
   
  render(){
    return (
          <Routes>
            <Route path="/" element={<Home/>}/>
            <Route path="/grilla" element={<GrillaPlatos/>}/>
            <Route path="/buscar/:termino" element={<Home/>}/>
            <Route path="/formulario/:idplato" element={<FrmPlato/>}/>
            <Route path="/detalle">
              <Route path=":idplato" element={<DetallePlato />} />
            </Route>
            <Route path="*" element={<Home/>}/>
          </Routes>
    );
  }
}

export default AppCocina;
