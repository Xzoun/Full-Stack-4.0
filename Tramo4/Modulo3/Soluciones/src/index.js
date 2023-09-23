import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import reportWebVitals from './reportWebVitals';
import { HashRouter as Router, Route, Routes } from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.min.css';

import Ejercicio1 from './routes/Ejercicio1';
import Ejercicio2 from './routes/Ejercicio2';
import Ejercicio3 from './routes/Ejercicio3'
import Ejercicio4 from './routes/Ejercicio4';
import Ejercicio5 from './routes/Ejercicio5';
import Ejercicio6 from './routes/Ejercicio6';
import Main1Ejercicio4 from './components/ejercicio4Main1';
import Main2Ejercicio4 from './components/ejercicio4Main2';

import DelayedComponent from './components/delayedComponent';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <Router>
    <Routes>
      <Route path="/" element={<DelayedComponent />} />
      <Route path="/ejercicio1" element={<Ejercicio1 />} />
      <Route path="/ejercicio2" element={<Ejercicio2 />} />
      <Route path="/ejercicio3" element={<Ejercicio3 />} />
      <Route path="/ejercicio4" element={<Ejercicio4 />} />
      <Route path="/ejercicio5" element={<Ejercicio5 />} />
      <Route path="/ejercicio6" element={<Ejercicio6 />} />
      <Route path="/ejercicio4/Main1" element={<Main1Ejercicio4 />} />
      <Route path="/ejercicio4/Main2" element={<Main2Ejercicio4 />} />
    </Routes>
  </Router>
);

reportWebVitals();
