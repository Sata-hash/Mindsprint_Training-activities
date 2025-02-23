import axios from 'axios';
import { useEffect, useState } from 'react';
import { Link } from 'react-router-dom';

function Products() {
    const [products, setProducts] = useState([]);

    const fetchData = async () => {
        try{
            const res = await axios.get('https://dummyjson.com/products');
            setProducts(res.data.products)
        }
        catch(err){
            console.log(err);
        }
    }

    // this effect will execute only once when component loads
    useEffect(() => {
        fetchData();
    }, [])
    // Empty array indicated dependency here

    return ( 
        <div>
            <h3 className="text-center p-2 text-bg-secondary">
                Products Page
            </h3>
            <div className='row'>
                {/*  {products[0].title} --> giving error because initially array is empty */ }
                {
                products.map(product=>(
                    <div className='col-12 col-md-6 col-lg-4'>
                        <h3>{product.title}</h3>
                        <Link to={`/products/${product.id}`}>
                            <img src={product.thumbnail} />
                        </Link>
                        <p>$ {product.price}</p>
                        <p>Rating : {product.rating}</p>
                        <button className='btn btn-primary'> Add to Cart</button>
                    </div>
                ))
            }
            </div>
        </div>
     );
}

export default Products;