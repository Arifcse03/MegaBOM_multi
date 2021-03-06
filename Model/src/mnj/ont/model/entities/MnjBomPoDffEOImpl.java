package mnj.ont.model.entities;

import java.sql.SQLException;
import mnj.ont.*;

import java.util.Map;

import mnj.ont.model.services.AppModuleImpl;

import oracle.adf.share.ADFContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon May 28 14:12:30 BDT 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MnjBomPoDffEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        HeaderId {
            public Object get(MnjBomPoDffEOImpl obj) {
                return obj.getHeaderId();
            }

            public void put(MnjBomPoDffEOImpl obj, Object value) {
                obj.setHeaderId((Number)value);
            }
        }
        ,
        BomId {
            public Object get(MnjBomPoDffEOImpl obj) {
                return obj.getBomId();
            }

            public void put(MnjBomPoDffEOImpl obj, Object value) {
                obj.setBomId((Number)value);
            }
        }
        ,
        OrgId {
            public Object get(MnjBomPoDffEOImpl obj) {
                return obj.getOrgId();
            }

            public void put(MnjBomPoDffEOImpl obj, Object value) {
                obj.setOrgId((Number)value);
            }
        }
        ,
        UserId {
            public Object get(MnjBomPoDffEOImpl obj) {
                return obj.getUserId();
            }

            public void put(MnjBomPoDffEOImpl obj, Object value) {
                obj.setUserId((Number)value);
            }
        }
        ,
        PrNo {
            public Object get(MnjBomPoDffEOImpl obj) {
                return obj.getPrNo();
            }

            public void put(MnjBomPoDffEOImpl obj, Object value) {
                obj.setPrNo((Number)value);
            }
        }
        ,
        PurchaseMode {
            public Object get(MnjBomPoDffEOImpl obj) {
                return obj.getPurchaseMode();
            }

            public void put(MnjBomPoDffEOImpl obj, Object value) {
                obj.setPurchaseMode((String)value);
            }
        }
        ,
        ShipMode {
            public Object get(MnjBomPoDffEOImpl obj) {
                return obj.getShipMode();
            }

            public void put(MnjBomPoDffEOImpl obj, Object value) {
                obj.setShipMode((String)value);
            }
        }
        ,
        DeliveryTerm {
            public Object get(MnjBomPoDffEOImpl obj) {
                return obj.getDeliveryTerm();
            }

            public void put(MnjBomPoDffEOImpl obj, Object value) {
                obj.setDeliveryTerm((String)value);
            }
        }
        ,
        SpoType {
            public Object get(MnjBomPoDffEOImpl obj) {
                return obj.getSpoType();
            }

            public void put(MnjBomPoDffEOImpl obj, Object value) {
                obj.setSpoType((String)value);
            }
        }
        ,
        NominatedBy {
            public Object get(MnjBomPoDffEOImpl obj) {
                return obj.getNominatedBy();
            }

            public void put(MnjBomPoDffEOImpl obj, Object value) {
                obj.setNominatedBy((String)value);
            }
        }
        ,
        PartialShipment {
            public Object get(MnjBomPoDffEOImpl obj) {
                return obj.getPartialShipment();
            }

            public void put(MnjBomPoDffEOImpl obj, Object value) {
                obj.setPartialShipment((String)value);
            }
        }
        ,
        ExcessShipment {
            public Object get(MnjBomPoDffEOImpl obj) {
                return obj.getExcessShipment();
            }

            public void put(MnjBomPoDffEOImpl obj, Object value) {
                obj.setExcessShipment((String)value);
            }
        }
        ,
        ActualSupplier {
            public Object get(MnjBomPoDffEOImpl obj) {
                return obj.getActualSupplier();
            }

            public void put(MnjBomPoDffEOImpl obj, Object value) {
                obj.setActualSupplier((String)value);
            }
        }
        ,
        ActualSupplierId {
            public Object get(MnjBomPoDffEOImpl obj) {
                return obj.getActualSupplierId();
            }

            public void put(MnjBomPoDffEOImpl obj, Object value) {
                obj.setActualSupplierId((Number)value);
            }
        }
        ,
        CustMnjOntBomHeader {
            public Object get(MnjBomPoDffEOImpl obj) {
                return obj.getCustMnjOntBomHeader();
            }

            public void put(MnjBomPoDffEOImpl obj, Object value) {
                obj.setCustMnjOntBomHeader((CustMnjOntBomHeaderImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(MnjBomPoDffEOImpl object);

        public abstract void put(MnjBomPoDffEOImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int HEADERID = AttributesEnum.HeaderId.index();
    public static final int BOMID = AttributesEnum.BomId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int USERID = AttributesEnum.UserId.index();
    public static final int PRNO = AttributesEnum.PrNo.index();
    public static final int PURCHASEMODE = AttributesEnum.PurchaseMode.index();
    public static final int SHIPMODE = AttributesEnum.ShipMode.index();
    public static final int DELIVERYTERM = AttributesEnum.DeliveryTerm.index();
    public static final int SPOTYPE = AttributesEnum.SpoType.index();
    public static final int NOMINATEDBY = AttributesEnum.NominatedBy.index();
    public static final int PARTIALSHIPMENT = AttributesEnum.PartialShipment.index();
    public static final int EXCESSSHIPMENT = AttributesEnum.ExcessShipment.index();
    public static final int ACTUALSUPPLIER = AttributesEnum.ActualSupplier.index();
    public static final int ACTUALSUPPLIERID = AttributesEnum.ActualSupplierId.index();
    public static final int CUSTMNJONTBOMHEADER = AttributesEnum.CustMnjOntBomHeader.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MnjBomPoDffEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("mnj.ont.model.entities.MnjBomPoDffEO");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for HeaderId, using the alias name HeaderId.
     * @return the HeaderId
     */
    public Number getHeaderId() {
        return (Number)getAttributeInternal(HEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for HeaderId.
     * @param value value to set the HeaderId
     */
    public void setHeaderId(Number value) {
        setAttributeInternal(HEADERID, value);
    }

    /**
     * Gets the attribute value for BomId, using the alias name BomId.
     * @return the BomId
     */
    public Number getBomId() {
        return (Number)getAttributeInternal(BOMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BomId.
     * @param value value to set the BomId
     */
    public void setBomId(Number value) {
        setAttributeInternal(BOMID, value);
    }

    /**
     * Gets the attribute value for OrgId, using the alias name OrgId.
     * @return the OrgId
     */
    public Number getOrgId() {
        return (Number)getAttributeInternal(ORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrgId.
     * @param value value to set the OrgId
     */
    public void setOrgId(Number value) {
        setAttributeInternal(ORGID, value);
    }

    /**
     * Gets the attribute value for UserId, using the alias name UserId.
     * @return the UserId
     */
    public Number getUserId() {
        return (Number)getAttributeInternal(USERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for UserId.
     * @param value value to set the UserId
     */
    public void setUserId(Number value) {
        setAttributeInternal(USERID, value);
    }

    /**
     * Gets the attribute value for PrNo, using the alias name PrNo.
     * @return the PrNo
     */
    public Number getPrNo() {
        return (Number)getAttributeInternal(PRNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for PrNo.
     * @param value value to set the PrNo
     */
    public void setPrNo(Number value) {
        setAttributeInternal(PRNO, value);
    }

    /**
     * Gets the attribute value for PurchaseMode, using the alias name PurchaseMode.
     * @return the PurchaseMode
     */
    public String getPurchaseMode() {
        return (String)getAttributeInternal(PURCHASEMODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for PurchaseMode.
     * @param value value to set the PurchaseMode
     */
    public void setPurchaseMode(String value) {
        setAttributeInternal(PURCHASEMODE, value);
    }

    /**
     * Gets the attribute value for ShipMode, using the alias name ShipMode.
     * @return the ShipMode
     */
    public String getShipMode() {
        return (String)getAttributeInternal(SHIPMODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ShipMode.
     * @param value value to set the ShipMode
     */
    public void setShipMode(String value) {
        setAttributeInternal(SHIPMODE, value);
    }

    /**
     * Gets the attribute value for DeliveryTerm, using the alias name DeliveryTerm.
     * @return the DeliveryTerm
     */
    public String getDeliveryTerm() {
        return (String)getAttributeInternal(DELIVERYTERM);
    }

    /**
     * Sets <code>value</code> as the attribute value for DeliveryTerm.
     * @param value value to set the DeliveryTerm
     */
    public void setDeliveryTerm(String value) {
        setAttributeInternal(DELIVERYTERM, value);
    }

    /**
     * Gets the attribute value for SpoType, using the alias name SpoType.
     * @return the SpoType
     */
    public String getSpoType() {
        return (String)getAttributeInternal(SPOTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for SpoType.
     * @param value value to set the SpoType
     */
    public void setSpoType(String value) {
        setAttributeInternal(SPOTYPE, value);
    }

    /**
     * Gets the attribute value for NominatedBy, using the alias name NominatedBy.
     * @return the NominatedBy
     */
    public String getNominatedBy() {
        return (String)getAttributeInternal(NOMINATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for NominatedBy.
     * @param value value to set the NominatedBy
     */
    public void setNominatedBy(String value) {
        setAttributeInternal(NOMINATEDBY, value);
    }

    /**
     * Gets the attribute value for PartialShipment, using the alias name PartialShipment.
     * @return the PartialShipment
     */
    public String getPartialShipment() {
        return (String)getAttributeInternal(PARTIALSHIPMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for PartialShipment.
     * @param value value to set the PartialShipment
     */
    public void setPartialShipment(String value) {
        setAttributeInternal(PARTIALSHIPMENT, value);
    }

    /**
     * Gets the attribute value for ExcessShipment, using the alias name ExcessShipment.
     * @return the ExcessShipment
     */
    public String getExcessShipment() {
        return (String)getAttributeInternal(EXCESSSHIPMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExcessShipment.
     * @param value value to set the ExcessShipment
     */
    public void setExcessShipment(String value) {
        setAttributeInternal(EXCESSSHIPMENT, value);
    }

    /**
     * Gets the attribute value for ActualSupplier, using the alias name ActualSupplier.
     * @return the ActualSupplier
     */
    public String getActualSupplier() {
        return (String)getAttributeInternal(ACTUALSUPPLIER);
    }

    /**
     * Sets <code>value</code> as the attribute value for ActualSupplier.
     * @param value value to set the ActualSupplier
     */
    public void setActualSupplier(String value) {
        setAttributeInternal(ACTUALSUPPLIER, value);
    }

    /**
     * Gets the attribute value for ActualSupplierId, using the alias name ActualSupplierId.
     * @return the ActualSupplierId
     */
    public Number getActualSupplierId() {
        return (Number)getAttributeInternal(ACTUALSUPPLIERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ActualSupplierId.
     * @param value value to set the ActualSupplierId
     */
    public void setActualSupplierId(Number value) {
        setAttributeInternal(ACTUALSUPPLIERID, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    /**
     * @return the associated entity CustMnjOntBomHeaderImpl.
     */
    public CustMnjOntBomHeaderImpl getCustMnjOntBomHeader() {
        return (CustMnjOntBomHeaderImpl)getAttributeInternal(CUSTMNJONTBOMHEADER);
    }

    /**
     * Sets <code>value</code> as the associated entity CustMnjOntBomHeaderImpl.
     */
    public void setCustMnjOntBomHeader(CustMnjOntBomHeaderImpl value) {
        setAttributeInternal(CUSTMNJONTBOMHEADER, value);
    }


    /**
     * @param headerId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number headerId) {
        return new Key(new Object[]{headerId});
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList)  {
        super.create(attributeList);
        oracle.jbo.server.SequenceImpl s =
            new oracle.jbo.server.SequenceImpl("MNJ_BOM_PO_DFF_SEQ",
                                               getDBTransaction());
        oracle.jbo.domain.Number sVal = s.getSequenceNumber();
        setHeaderId(sVal);
        
        Map sessionScope = ADFContext.getCurrent().getSessionScope();
        
        
       String user = (String)sessionScope.get("userId");
       
      // String user="1110";
        try{
            setUserId(new oracle.jbo.domain.Number(user));
        }catch(Exception e){
            ;
        }
        
        
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        Map sessionScope = ADFContext.getCurrent().getSessionScope();
     //  String user = (String)sessionScope.get("userId");
     //   String org = (String)sessionScope.get("userId");
//        
        String user = "2222";
        String org = "2222";
    
        
       

        if (DML_INSERT == operation) {
//            try {
//                
//               
//                setOrgId(new oracle.jbo.domain.Number(org));
//              setUserId(new oracle.jbo.domain.Number(user));
//                
//
//            } catch (SQLException f) {
//                
//                
//                ;
//            }
        }
     
        super.doDML(operation, e);
    }
}
