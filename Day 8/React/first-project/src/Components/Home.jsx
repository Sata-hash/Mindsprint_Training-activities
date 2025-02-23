function Home() {
    return (
        <div>
            <div id="carouselExampleCaptions" className="carousel slide">
                <div className="carousel-indicators">
                    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" className="active" aria-current="true" aria-label="Slide 1"></button>
                    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
                    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
                </div>
                <div className="carousel-inner">
                    <div className="carousel-item active">
                        <img src="https://tse1.mm.bing.net/th/id/OIP.cVbePOZKBPHMFxsicdTHIAHaFL?rs=1&pid=ImgDetMain" className="d-block w-100" alt="back1" height='350'/>
                            <div className="carousel-caption d-none d-md-block">
                                <h5>First slide label</h5>
                                <p>Some representative placeholder content for the first slide.</p>
                            </div>
                    </div>/
                    <div className="carousel-item">
                        <img src="https://tse1.mm.bing.net/th/id/OIP.srfVswkxATiGcFL68W-hfgHaFL?rs=1&pid=ImgDetMain" className="d-block w-100" alt="back2" height='350'/>
                            <div className="carousel-caption d-none d-md-block">
                                <h5>Second slide label</h5>
                                <p>Some representative placeholder content for the second slide.</p>
                            </div>
                    </div>
                    <div className="carousel-item">
                        <img src="https://tse1.mm.bing.net/th/id/OIP.suhrxCW8s1O3eLCc-ohdCgHaEK?w=333&h=180&c=7&r=0&o=5&dpr=1.5&pid=1.7" className="d-block w-100" alt="back3" height='350'/>
                            <div className="carousel-caption d-none d-md-block">
                                <h5>Third slide label</h5>
                                <p>Some representative placeholder content for the third slide.</p>
                            </div>
                    </div>
                </div>
                <button className="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
                    <span className="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span className="visually-hidden">Previous</span>
                </button>
                <button className="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
                    <span className="carousel-control-next-icon" aria-hidden="true"></span>
                    <span className="visually-hidden">Next</span>
                </button>
            </div>
        </div>
    );
}

export default Home;