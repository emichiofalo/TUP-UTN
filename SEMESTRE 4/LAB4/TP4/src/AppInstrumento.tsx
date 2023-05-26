import React, { Component, Suspense } from 'react';
import { Route, BrowserRouter as Router, Routes } from 'react-router-dom';
import { Productos } from './components/Productos';
import { DetalleInstrumento } from './components/DetalleInstrumento';
import { Home } from './components/Home';
import { Mapa } from './components/Mapa';
import Abm from './components/Abm';
import InstrumentForm from './components/InstrumentForm';


class AppInstrumento extends Component {


  render() {
    return (
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/dondeEstamos" element={<Mapa />} />
        <Route path="/productos" element={<Productos />} />
        <Route path="/detalle">
          <Route path=":idinstrumento" element={<DetalleInstrumento />} />
        </Route>
        <Route path="/abm" element={<Abm />} />
        <Route path="/instrumentForm" />
        <Route path="/instrumentForm">
          <Route path=":idinstrumento" element={<InstrumentForm />} />
        </Route>
        <Route path="*" element={<Productos />} />
      </Routes>
    );
  }
}

export default AppInstrumento;
