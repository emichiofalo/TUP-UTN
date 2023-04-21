import React from 'react';
import { MDBRow, MDBCol, MDBInput, MDBTextArea, MDBBtn } from 'mdb-react-ui-kit';
import { NavBar } from './NavBar';

export const Mapa = () => {
  return (
    <>
    <NavBar></NavBar>
    <div className='mapa'>
      <h3>Dónde estamos</h3><br />
        <img src="../images/mapa.png" alt="" style={{width:'100%', height: 'auto'}}/>
    </div>
    </>
  );
}