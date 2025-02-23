import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Header from './Components/Header'
import Footer from './Components/Footer'
import {BrowserRouter,Routes,Route} from 'react-router-dom';

import Home from './Components/Home'
import About from './Components/About'
import Users from './Components/Users'
import Contact from './Components/Contact'
import Login from './Components/Login'
import Products from './Components/Products'
import ProductDetails from './Components/ProductDetails'
import Register from './Components/Register'

function App() {
  return (
    <BrowserRouter>
      <div className='container'>
        <h1>E-Commerce Application</h1>
        <Header />
        <Routes>
            <Route path ='' element = {<Home />}></Route>
            <Route path ='home' element = {<Home />}></Route>
            <Route path ='contact' element = {<Contact />}></Route>
            <Route path ='about' element = {<About />}></Route>
            <Route path ='users' element = {<Users />}></Route>
            <Route path ='login' element = {<Login />}></Route>
            <Route path ='products' element = {<Products />}></Route>
            <Route path ='products/:id' element = {<ProductDetails />}></Route>
            <Route path ='register' element = {<Register />}></Route>
        </Routes>
        <Footer />
      </div>
    </BrowserRouter>
  )
}

export default App
