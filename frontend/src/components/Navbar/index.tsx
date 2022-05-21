import AvatarLogo from 'assets/img/male_avatar.svg';

const NavBar = () => {
    return (
        <div className="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-light border-bottom shadow-sm">
            <img src={AvatarLogo} alt="MyLogo" width="50" />
            <div className="container">
                <nav className="my-2 my-md-0 mr-md-3">
                    <span className='fs-4'>Dash Main</span>
                </nav>
            </div>
        </div>
    );
}

export default NavBar;