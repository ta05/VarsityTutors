A student plans to analyze product reviews found on a Web site by looking for keywords in posted reviews. The `ProductReview` class, shown below, is used to represent a single review. A product review consists of a product name and a review of that product.

~~~java
public class ProductReview {
    private String name;
    private String review;

    /** Constructs a ProductReview object and initializes the instance variables. */
    public ProdcutReview(String pName, String pReview) {
        name = pName;
        review = pReview;
    }

    /** Returns the name of the product. */
    public String getName() {
        return name;
    }

    /** Returns the review of the product. */
    public String getReview() {
        return review;
    }
}
~~~

The `ReviewCollector` class, shown below, is used to represent a collection of reviews to be analyzed.

~~~java
public class ReviewCollector {
    private ArrayList<ProductReview> reviewList;
    private ArrayList<String> productList;

    /** Constructs a ReviewCollector object and initializes the instance variables. */
    public ReviewCollector() {
        reviewList = new ArrayList<ProductReview>();
        productList = new ArrayList<String>();
    }

    /** Adds a new review to the collection of reviews, as described in part (a). */
    public void addReview(ProductReview prodReview) {
        /* to be implemented in part (a) */
    }

    /** Returns the number of good reviews for a given product name, as described in part (b). */
    public int getNumGoodReviews(String prodName) {
        /* to be implemented in part (b) */
    }
}
~~~

<ol style="list-style-type:lower-alpha">
    <li>Write the <code>addReview</code> method, which adds a single product review represented by a <code>ProductReview</code> object, to the <code>ReviewCollector</code> object. The <code>addReview</code> method does the following when it adds a product review.
        <ul>
            <li>The <code>ProductReview</code> object is added to the <code>reviewList</code> instance variable.</li>
            <li>The product name from the <code>ProductReview</code> object is added to the <code>productList</code> instance variable if the product name is not already found in the <code>productList</code></li>
        </ul>
    Elements may be added to <code>reviewList</code> and <code>productList</code> in any order.<br>
    Complete method <code>addReview</code>.<br>
    /** Adds a new review to the collection of reviews. */
    <code>public void addReview(ProductReview prodReview)</code>
    </li>
    <li>Write the <code>getNumGoodReviews</code> method, which returns the number of good reviews for a given product name. A review is considered good ig it contains the string <code>"best"</code> (all lowercase). If there are no reviews with a matching product name, the method returns <code>0</code>. Note that a review that contains <code>"BEST"</code> or <code>"Best"</code> is not considered a good review (since not all the letters of <code>"best"</code> are lowercase), but a review that contains <code>"abestos"</code> is considered a good review (since all the letters of <code>"best"</code> are lowercase).<br>
    Complete method <code>getNumGoodReviews</code>.<br>
    /** Returns the number of good reviews for a given product name. */
    <code>public int getNumGoodReviews(String prodName)</code>
    </li>
</ol>