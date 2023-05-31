import { BrowserRouter, Routes, Route } from "react-router-dom"
import TablaProvincias from "./components/TablaProvincias"
import FormularioProvincia from "./components/FormularioProvincia"
import ProvinciaDetalle from "./components/ProvinciaDetalle"
import Navigation from "./components/Navigation"
import "bootstrap/dist/css/bootstrap.min.css";

function App() {
  return (
    <>
      <Navigation />
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<TablaProvincias />} />
          <Route path="/detalle">
            <Route path=":idprovincia" element={<ProvinciaDetalle />} />
          </Route>
          <Route path="/nueva">
            <Route path=":idprovincia" element={<FormularioProvincia />} />
          </Route>
        </Routes>
      </BrowserRouter>
    </>
  )
}

export default App
