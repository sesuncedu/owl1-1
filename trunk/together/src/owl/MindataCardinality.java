/* Generated by Together */

package owl;

public class DataMinCardinality extends Description {
    /**
     * @alias cardinality : UnlimitedNatural
     */
    public int cardinality;
    /**
     * @directed
     * @supplierCardinality 0..1
     * @supplierRole dataRange
     */
    DataRange dataRange;
    /**
     * @directed
     * @supplierCardinality 1
     * @supplierRole dataProperty
     */
    DataPropertyExpression dataProperty;
}
