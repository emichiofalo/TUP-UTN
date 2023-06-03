import { Route, BrowserRouter, Routes } from "react-router-dom";
import Navigation from "./components/Navigation";
import GrillaArticulos from "./components/GrillaArticulos";
import FormArticulo from "./components/FormArticulo";

function App() {

  return (
    <BrowserRouter>
      <Navigation />
      <Routes>
        <Route path="/" element={<GrillaArticulos />} />
        <Route path="/form">
          <Route path=":idarticulo" element={<FormArticulo />} />
        </Route>
      </Routes>
    </BrowserRouter>

  )
}

export default App
