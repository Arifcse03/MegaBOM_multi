package mnj.ont.model.views;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jun 01 19:23:56 PKT 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CustMnjOntBomHeaderViewImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public CustMnjOntBomHeaderViewImpl() {
    }


    /**
     * Returns the bind variable value for p_userId.
     * @return bind variable value for p_userId
     */
    public String getp_userId() {
        return (String)getNamedWhereClauseParam("p_userId");
    }

    /**
     * Sets <code>value</code> for bind variable p_userId.
     * @param value value to bind as p_userId
     */
    public void setp_userId(String value) {
        setNamedWhereClauseParam("p_userId", value);
    }


    /**
     * Returns the variable value for Buyer_name.
     * @return variable value for Buyer_name
     */
    public String getBuyer_name() {
        return (String)ensureVariableManager().getVariableValue("Buyer_name");
    }

    /**
     * Sets <code>value</code> for variable Buyer_name.
     * @param value value to bind as Buyer_name
     */
    public void setBuyer_name(String value) {
        ensureVariableManager().setVariableValue("Buyer_name", value);
    }
}
