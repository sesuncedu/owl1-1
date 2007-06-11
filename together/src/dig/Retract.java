/* Generated by Together */

package dig;

import java.util.*;

import owl.*;

public class Retract extends RequestToOntology {
    /**
     * @link aggregationByValue
     * @associates <{Imports}>
     * @associationAsClass <<set>>
     * @supplierCardinality *
     * @clientRole imports
     * @directed
     */
    public Set imports;
    /**
     * @link aggregationByValue
     * @associates <{Annotation}>
     * @associationAsClass <<set>>
     * @supplierCardinality *
     * @clientRole annotations
     * @directed
     */
    public Set annotations;
    /**
     * @link aggregationByValue
     * @associates <{Axiom}>
     * @associationAsClass <<set>>
     * @supplierCardinality 0 ..*
     * @clientRole axioms
     * @directed
     */
    public Set axioms;
}