import React from 'react'
import './Navbar.css'

export default function Navbar() {
    return (
        <div>
            <nav className="navbar">
                <div className="logo">
                    Small-Biz
                </div>
                <div className="menu-items">
                    <div className="search-box">
                        <input type="text" class="searchTerm" placeholder="What are you looking for?"/>
                        <button type="submit" class="searchButton">
                            <i class="fa fa-search"></i>
                        </button>
                    </div>
                    <div className="login">
                        <button>Login</button>
                    </div>
                    <div className="account">
                        <button>My Account</button>
                    </div>
                    <div className="cart">
                        <button>Cart</button>
                    </div>
                </div>
            </nav>
        </div>
    )
}
