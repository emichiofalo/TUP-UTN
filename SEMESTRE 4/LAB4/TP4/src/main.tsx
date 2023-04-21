import React from 'react'
import ReactDOM from 'react-dom/client'
import './index.css'
import {BrowserRouter} from 'react-router-dom';
import AppInstrumento from './AppInstrumento'

ReactDOM.createRoot(document.getElementById('root') as HTMLElement).render(
  <React.StrictMode>
    <BrowserRouter basename="/">
      <AppInstrumento />
    </BrowserRouter>
  </React.StrictMode>,
)
