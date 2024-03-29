/* Generated by Together */

package dig;

import java.util.*;

public class DIGDescription extends Response {
    public String name;
    public String version;
    public String message;
    public String supportsLanguage;
    public boolean supportsAnnotations;
    public boolean supportsImports;
    /**
     * @link aggregationByValue
     * @associates <{dig.SupportedRequest}>
     * @associationAsClass <<set>>
     * @supplierCardinality 1 ..*
     * @clientRole annotations
     * @directed
     */
	public SetOfEntites supportedRequests;
}
