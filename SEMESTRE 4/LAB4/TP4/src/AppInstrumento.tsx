import React, { Component, Suspense } from 'react';
import { Route, BrowserRouter as Router, Routes } from 'react-router-dom';
import { Productos } from './components/Productos';
import { DetalleInstrumento } from './components/DetalleInstrumento';
import { Home } from './components/Home';
import { Mapa } from './components/Mapa';


class AppInstrumento extends Component{
  
   
  render(){
    return (
          <Routes>
            <Route path="/" element={<Home/>}/>
            <Route path="/dondeEstamos" element={<Mapa/>}/>
            <Route path="/productos" element={<Productos/>}/>
            <Route path="/detalle"> 
              <Route path=":idinstrumento" element={<DetalleInstrumento />} />
            </Route>
            <Route path="*" element={<Productos/>}/>
          </Routes>
    );
  }
}

export default AppInstrumento;
