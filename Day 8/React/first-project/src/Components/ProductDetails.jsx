import axios from "axios";
import { useEffect } from "react";
import { useState } from "react";
import { useParams } from "react-router-dom";

function ProductDetails() {

    const [product, setProduct] = useState(null);

    const fetchData = async () => {
        try{
            const res = await axios.get('https://dummyjson.com/products/'+ id);
            setProduct(res.data)
        }
        catch(err){
            console.log(err);
        }
    }

    // this effect will execute only once when component loads
    useEffect(() => {
        fetchData();
    }, [])

    const {id} = useParams(); // it will get the data from URL parameters
    return ( 
        <div>
            {
                product && 
                <div>
                    <h3>{product.title}</h3>
                    <img src={product.thumbnail}  />
                    <p>{product.description}</p>
                    <p>Category : {product.category}</p>

                    <h5>Reviews</h5>
                    {
                        product.reviews.map(review=>(
                            <>
                                <p>
                                    Rating : {review.rating}    <br />
                                    Comment : {review.comment}    <br />
                                    User name : {review.reviewerName}   <br />
                                    Date : {review.date}
                                </p>
                                <hr />
                            </>
                        ))
                    }
                </div>
            }
        </div>
    );
}

export default ProductDetails;