import { Route, BrowserRouter, Routes } from "react-router-dom";
import DemoBanner from "./components/DemoBanner";
import TablaBanners from "./components/TablaBanners";
import FormularioBanner from "./components/FormularioBanner";
import Navigation from "./components/Navigation";

function App() {

  return (
    <BrowserRouter>
      <Navigation />
      <Routes>
        <Route path="/" element={<DemoBanner />} />
        <Route path="/tabla" element={<TablaBanners />} />
        <Route path="/form">
          <Route path=":idbanner" element={<FormularioBanner />} />
        </Route>
      </Routes>
    </BrowserRouter>

  )
}

export default App
