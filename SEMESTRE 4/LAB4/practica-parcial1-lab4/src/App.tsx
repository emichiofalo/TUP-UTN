import { Route, Routes } from 'react-router'
import AgendaContacto from './components/AgendaContacto'
import { BrowserRouter } from 'react-router-dom'
import "bootstrap/dist/css/bootstrap.min.css";
import TablaAgenda from './components/TablaAgenda';
import FormularioAgenda from './components/FormularioAgenda';

function App() {

  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<AgendaContacto />} />
          <Route path="/tabla" element={<TablaAgenda />} />
          <Route path="/form">
            <Route path=":idcontacto" element={<FormularioAgenda />} />
          </Route>
          <Route path="*" element={<AgendaContacto />} />
        </Routes>
      </BrowserRouter>
    </>
  )
}

export default App
