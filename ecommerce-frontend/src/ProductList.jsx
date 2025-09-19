const ProductList = ({ products }) => {
    return(
        <div className="row">
            {products.map(product => {
                return(
                    <div className="col-lg-4 col-md-4 col-sm-12 mb-4" key={product.id}>
                    <div className="card h-100">
                        <img
                            src={product.imageUrl || 'https://picsum.photos/600/400'}
                            className="card-img-top"
                            alt="product.name"
                        >
                        </img>
                        <div className="card-body">
                            <h5 className="card-title">{product.name}</h5>
                            <p className="card-text">{product.description}</p>
                            <p className="card-text">Price: <strong>{product.price}</strong></p>
                        </div>
                    </div>
                </div>
                )
            })}
        </div>
    )
}

export default ProductList;