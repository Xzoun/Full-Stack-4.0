import logoIg from '../Imagenes/Instagram.png';
import logoLi from '../Imagenes/Linkedin.png'

const FooterEjercicio = () => {
    return (
        <footer className='padding borderTop marginBot'>
            <h5>Para comunicarte conmigo hacelo a través de cualquiera de estos links</h5>
            <div className='padding flex centerFlex'>
                <a className="linkLogo" href="https://www.instagram.com/lebenitez_/" target="_blank" rel="noopener noreferrer">
                    Instagram<img className="footerLogo" src={logoIg} alt="Logo Instagram" /></a>
                <a className="linkLogo" href="https://www.linkedin.com/in/leobenitez/" target="_blank" rel="noopener noreferrer">
                    Linked<img className="footerLogo" src={logoLi} alt="Logo Linkedin" /></a>
            </div>
        </footer>
    );
};

export default FooterEjercicio;