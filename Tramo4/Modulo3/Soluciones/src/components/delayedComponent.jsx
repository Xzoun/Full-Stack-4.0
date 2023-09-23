import React, { useState, useEffect } from 'react';
import logo from '../logo.svg';
import App from '../App';

const DelayedComponent = () => {
    const [showLogo, setShowLogo] = useState(true);

    useEffect(() => {
        const delay = 3300;

        const timer = setTimeout(() => {
            setShowLogo(false);
        }, delay);

        return () => {
            clearTimeout(timer);
        };
    }, []);

    return (
        <>
            {showLogo ? (
                <div className="App">
                    <div className="flex">
                        <h1>React</h1>
                        <div className="logoContainer">
                            <div className="App-logo">
                                <img src={logo} className="logoImage" alt="logo" />
                            </div>
                        </div>
                    </div>
                    <App></App>
                </div>
            ) : (
                <div className="App" >
                    <div className="flex">
                        <h1>React</h1>
                        <div className="logoContainer">
                            <img src={logo} className="App-logo" alt="logo" />
                        </div>
                    </div>
                    <App></App>
                </div>
            )}
        </>
    );
};

export default DelayedComponent;