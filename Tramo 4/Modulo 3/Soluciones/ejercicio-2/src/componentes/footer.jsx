import logoIg from '../Imagenes/Instagram.png';

export const Footer = () => {
    return (
        <footer>
            <div id="contacto">
                <h1 className="center">Le Benitez!</h1>
                <div className="flex">
                    <img className="instagramLogo" src={logoIg} alt="Logo Instagram"/>
                    <a href="https://www.instagram.com/lebenitez_/" target="_blank">
                        Instagram</a>
                </div>
            </div>
        </footer>

    );
};