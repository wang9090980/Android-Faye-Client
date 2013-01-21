package com.moneydesktop.finance.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;

import com.moneydesktop.finance.ApplicationContext;
import com.moneydesktop.finance.data.Constant;
import com.moneydesktop.finance.data.DataController;
import com.moneydesktop.finance.model.User;
import com.moneydesktop.finance.util.Enums.DataState;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table TRANSACTIONS.
 */
public class Transactions extends BusinessObject  {

    private Long id;
    private Double amount;
    private Double amountReimbursable;
    private java.util.Date date;
    private java.util.Date datePosted;
    private Integer dayNumber;
    private Integer exclusionFlags;
    private Boolean hasReceipt;
    private Boolean hasSplit;
    private Boolean isBusiness;
    private Boolean isCleared;
    private Boolean isExcluded;
    private Boolean isFlagged;
    private Boolean isManual;
    private Boolean isMatched;
    private Boolean isProcessed;
    private Boolean isReimbursable;
    private Boolean isReported;
    private Boolean isReportedAndPaid;
    private Boolean isReportedAndSubmitted;
    private Boolean isSplit;
    private Boolean isVoid;
    private String memo;
    private Integer monthNumber;
    private Double normalizedAmount;
    private String originalCategory;
    private String originalTitle;
    private Integer quarterNumber;
    private Double rawAmount;
    private String reference;
    private String tagString;
    private String title;
    private String transactionId;
    private Integer transactionType;
    private Integer weekNumber;
    private Integer yearNumber;
    private Long bankAccountId;
    private Long categoryId;
    private Long parentTransactionId;
    private long businessObjectId;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient TransactionsDao myDao;

    private BankAccount bankAccount;
    private Long bankAccount__resolvedKey;

    private Category category;
    private Long category__resolvedKey;

    private Transactions parent;
    private Long parent__resolvedKey;

    private BusinessObjectBase businessObjectBase;
    private Long businessObjectBase__resolvedKey;

    private List<Transactions> children;

    // KEEP FIELDS - put your custom fields here
    private QueryProperty mTagInstance = new QueryProperty(TagInstanceDao.TABLENAME, TagDao.Properties.Id, TagInstanceDao.Properties.TagId);
    private QueryProperty mBaseObjectId = new QueryProperty(TagInstanceDao.TABLENAME, TagInstanceDao.Properties.BaseObjectId);
    
    // KEEP FIELDS END

    public Transactions() {
    }

    public Transactions(Long id) {
        this.id = id;
    }

    public Transactions(Long id, Double amount, Double amountReimbursable, java.util.Date date, java.util.Date datePosted, Integer dayNumber, Integer exclusionFlags, Boolean hasReceipt, Boolean hasSplit, Boolean isBusiness, Boolean isCleared, Boolean isExcluded, Boolean isFlagged, Boolean isManual, Boolean isMatched, Boolean isProcessed, Boolean isReimbursable, Boolean isReported, Boolean isReportedAndPaid, Boolean isReportedAndSubmitted, Boolean isSplit, Boolean isVoid, String memo, Integer monthNumber, Double normalizedAmount, String originalCategory, String originalTitle, Integer quarterNumber, Double rawAmount, String reference, String tagString, String title, String transactionId, Integer transactionType, Integer weekNumber, Integer yearNumber, Long bankAccountId, Long categoryId, Long parentTransactionId, long businessObjectId) {
        this.id = id;
        this.amount = amount;
        this.amountReimbursable = amountReimbursable;
        this.date = date;
        this.datePosted = datePosted;
        this.dayNumber = dayNumber;
        this.exclusionFlags = exclusionFlags;
        this.hasReceipt = hasReceipt;
        this.hasSplit = hasSplit;
        this.isBusiness = isBusiness;
        this.isCleared = isCleared;
        this.isExcluded = isExcluded;
        this.isFlagged = isFlagged;
        this.isManual = isManual;
        this.isMatched = isMatched;
        this.isProcessed = isProcessed;
        this.isReimbursable = isReimbursable;
        this.isReported = isReported;
        this.isReportedAndPaid = isReportedAndPaid;
        this.isReportedAndSubmitted = isReportedAndSubmitted;
        this.isSplit = isSplit;
        this.isVoid = isVoid;
        this.memo = memo;
        this.monthNumber = monthNumber;
        this.normalizedAmount = normalizedAmount;
        this.originalCategory = originalCategory;
        this.originalTitle = originalTitle;
        this.quarterNumber = quarterNumber;
        this.rawAmount = rawAmount;
        this.reference = reference;
        this.tagString = tagString;
        this.title = title;
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.weekNumber = weekNumber;
        this.yearNumber = yearNumber;
        this.bankAccountId = bankAccountId;
        this.categoryId = categoryId;
        this.parentTransactionId = parentTransactionId;
        this.businessObjectId = businessObjectId;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getTransactionsDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getAmountReimbursable() {
        return amountReimbursable;
    }

    public void setAmountReimbursable(Double amountReimbursable) {
        this.amountReimbursable = amountReimbursable;
    }

    public java.util.Date getDate() {
        return date;
    }

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    public java.util.Date getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(java.util.Date datePosted) {
        this.datePosted = datePosted;
    }

    public Integer getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(Integer dayNumber) {
        this.dayNumber = dayNumber;
    }

    public Integer getExclusionFlags() {
        return exclusionFlags;
    }

    public void setExclusionFlags(Integer exclusionFlags) {
        this.exclusionFlags = exclusionFlags;
    }

    public Boolean getHasReceipt() {
        return hasReceipt;
    }

    public void setHasReceipt(Boolean hasReceipt) {
        this.hasReceipt = hasReceipt;
    }

    public Boolean getHasSplit() {
        return hasSplit;
    }

    public void setHasSplit(Boolean hasSplit) {
        this.hasSplit = hasSplit;
    }

    public Boolean getIsBusiness() {
        return isBusiness;
    }

    public void setIsBusiness(Boolean isBusiness) {
        this.isBusiness = isBusiness;
    }

    public Boolean getIsCleared() {
        return isCleared;
    }

    public void setIsCleared(Boolean isCleared) {
        this.isCleared = isCleared;
    }

    public Boolean getIsExcluded() {
        return isExcluded;
    }

    public void setIsExcluded(Boolean isExcluded) {
        this.isExcluded = isExcluded;
    }

    public Boolean getIsFlagged() {
        return isFlagged;
    }

    public void setIsFlagged(Boolean isFlagged) {
        this.isFlagged = isFlagged;
    }

    public Boolean getIsManual() {
        return isManual;
    }

    public void setIsManual(Boolean isManual) {
        this.isManual = isManual;
    }

    public Boolean getIsMatched() {
        return isMatched;
    }

    public void setIsMatched(Boolean isMatched) {
        this.isMatched = isMatched;
    }

    public Boolean getIsProcessed() {
        return isProcessed;
    }

    public void setIsProcessed(Boolean isProcessed) {
        this.isProcessed = isProcessed;
    }

    public Boolean getIsReimbursable() {
        return isReimbursable;
    }

    public void setIsReimbursable(Boolean isReimbursable) {
        this.isReimbursable = isReimbursable;
    }

    public Boolean getIsReported() {
        return isReported;
    }

    public void setIsReported(Boolean isReported) {
        this.isReported = isReported;
    }

    public Boolean getIsReportedAndPaid() {
        return isReportedAndPaid;
    }

    public void setIsReportedAndPaid(Boolean isReportedAndPaid) {
        this.isReportedAndPaid = isReportedAndPaid;
    }

    public Boolean getIsReportedAndSubmitted() {
        return isReportedAndSubmitted;
    }

    public void setIsReportedAndSubmitted(Boolean isReportedAndSubmitted) {
        this.isReportedAndSubmitted = isReportedAndSubmitted;
    }

    public Boolean getIsSplit() {
        return isSplit;
    }

    public void setIsSplit(Boolean isSplit) {
        this.isSplit = isSplit;
    }

    public Boolean getIsVoid() {
        return isVoid;
    }

    public void setIsVoid(Boolean isVoid) {
        this.isVoid = isVoid;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(Integer monthNumber) {
        this.monthNumber = monthNumber;
    }

    public Double getNormalizedAmount() {
        return normalizedAmount;
    }

    public void setNormalizedAmount(Double normalizedAmount) {
        this.normalizedAmount = normalizedAmount;
    }

    public String getOriginalCategory() {
        return originalCategory;
    }

    public void setOriginalCategory(String originalCategory) {
        this.originalCategory = originalCategory;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public Integer getQuarterNumber() {
        return quarterNumber;
    }

    public void setQuarterNumber(Integer quarterNumber) {
        this.quarterNumber = quarterNumber;
    }

    public Double getRawAmount() {
        return rawAmount;
    }

    public void setRawAmount(Double rawAmount) {
        this.rawAmount = rawAmount;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getTagString() {
        return tagString;
    }

    public void setTagString(String tagString) {
        this.tagString = tagString;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(Integer transactionType) {
        this.transactionType = transactionType;
    }

    public Integer getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(Integer weekNumber) {
        this.weekNumber = weekNumber;
    }

    public Integer getYearNumber() {
        return yearNumber;
    }

    public void setYearNumber(Integer yearNumber) {
        this.yearNumber = yearNumber;
    }

    public Long getBankAccountId() {
        return bankAccountId;
    }

    public void setBankAccountId(Long bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getParentTransactionId() {
        return parentTransactionId;
    }

    public void setParentTransactionId(Long parentTransactionId) {
        this.parentTransactionId = parentTransactionId;
    }

    public long getBusinessObjectId() {
        return businessObjectId;
    }

    public void setBusinessObjectId(long businessObjectId) {
        this.businessObjectId = businessObjectId;
    }

    /** To-one relationship, resolved on first access. */
    public BankAccount getBankAccount() {
        if (bankAccount__resolvedKey == null || !bankAccount__resolvedKey.equals(bankAccountId)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            BankAccountDao targetDao = daoSession.getBankAccountDao();
            bankAccount = targetDao.load(bankAccountId);
            bankAccount__resolvedKey = bankAccountId;
        }
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        bankAccountId = bankAccount == null ? null : bankAccount.getId();
        bankAccount__resolvedKey = bankAccountId;
    }

    /** To-one relationship, resolved on first access. */
    public Category getCategory() {
        if (category__resolvedKey == null || !category__resolvedKey.equals(categoryId)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            CategoryDao targetDao = daoSession.getCategoryDao();
            category = targetDao.load(categoryId);
            category__resolvedKey = categoryId;
        }
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
        categoryId = category == null ? null : category.getId();
        category__resolvedKey = categoryId;
    }

    /** To-one relationship, resolved on first access. */
    public Transactions getParent() {
        if (parent__resolvedKey == null || !parent__resolvedKey.equals(parentTransactionId)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            TransactionsDao targetDao = daoSession.getTransactionsDao();
            parent = targetDao.load(parentTransactionId);
            parent__resolvedKey = parentTransactionId;
        }
        return parent;
    }

    public void setParent(Transactions parent) {
        this.parent = parent;
        parentTransactionId = parent == null ? null : parent.getId();
        parent__resolvedKey = parentTransactionId;
    }

    /** To-one relationship, resolved on first access. */
    public BusinessObjectBase getBusinessObjectBase() {
        if (businessObjectBase__resolvedKey == null || !businessObjectBase__resolvedKey.equals(businessObjectId)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            BusinessObjectBaseDao targetDao = daoSession.getBusinessObjectBaseDao();
            businessObjectBase = targetDao.load(businessObjectId);
            businessObjectBase__resolvedKey = businessObjectId;
        }
        return businessObjectBase;
    }

    public void setBusinessObjectBase(BusinessObjectBase businessObjectBase) {
        if (businessObjectBase == null) {
            throw new DaoException("To-one property 'businessObjectId' has not-null constraint; cannot set to-one to null");
        }
        this.businessObjectBase = businessObjectBase;
        businessObjectId = businessObjectBase.getId();
        businessObjectBase__resolvedKey = businessObjectId;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public synchronized List<Transactions> getChildren() {
        if (children == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            TransactionsDao targetDao = daoSession.getTransactionsDao();
            children = targetDao._queryTransactions_Children(id);
        }
        return children;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetChildren() {
        children = null;
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

    // KEEP METHODS - put your custom methods here
    
    public void setExternalId(String id) {
    	setTransactionId(id);
    	getBusinessObjectBase().setExternalId(id);
    }
    
    public String getExternalId() {
    	return getTransactionId();
    }
    
    public static Transactions saveTransaction(JSONObject json, boolean delete) {
    	
    	Transactions transaction = (Transactions) saveObject(json, Transactions.class, delete);

    	// Object was deleted no need to continue
    	if (transaction == null)
    		return null;
    	
    	if (!json.optString(Constant.KEY_DUPLICATE).equals(Constant.VALUE_NULL) && (json.optBoolean(Constant.KEY_DUPLICATE) || json.optBoolean(Constant.KEY_ISDELETED) || json.optBoolean(Constant.KEY_IS_DELETED))) {
    		
    		// TODO: Notification with transactionId
    		
    		transaction.deleteBatch();
    		
    		return null;
    	}
    	
    	if (transaction.isNew()) {
    		
    		transaction.setExclusionFlags(0);
    	
    	} else {

        	int serverVersion = json.optInt(Constant.KEY_REVISION, 0);
        	int localVersion = transaction.getBusinessObjectBase().getVersion();
        	
        	if (serverVersion == localVersion && serverVersion != 0) {
        		
        		return transaction;
        	
        	} else if (localVersion > serverVersion) {
        		
        		transaction.updateDataState();
        		
        		return transaction;
        	}
        	
        	transaction.getBusinessObjectBase().setVersion(serverVersion);
    	}
    	
    	transaction.setIgnoreWillSave(true);
    	transaction.getBusinessObjectBase().setExternalId(transaction.getExternalId());
    	transaction.setIsBusiness(!json.optBoolean(Constant.KEY_IS_PERSONAL));
    	
    	BankAccount bankAccount = (BankAccount) getObject(BankAccount.class, json.optString(Constant.KEY_ACCOUNT_GUID));
    	
    	if (bankAccount != null) {
    		
	    	transaction.setBankAccountId(bankAccount.getId());
	    	bankAccount.acceptChanges();
	    	bankAccount.updateBatch();
    	}
    	
    	if (!json.optString(Constant.KEY_DATE).equals(Constant.VALUE_NULL))
    		transaction.setDate(new Date((json.optLong(Constant.KEY_DATE) * 1000)));
    	
    	if (!json.optString(Constant.KEY_POSTED_DATE).equals(Constant.VALUE_NULL))
    		transaction.setDatePosted(new Date((json.optLong(Constant.KEY_POSTED_DATE) * 1000)));
    	
    	if (!json.optString(Constant.KEY_HAS_BEEN_VIEWED).equals(Constant.VALUE_NULL))
    		transaction.setIsProcessed(json.optBoolean(Constant.KEY_HAS_BEEN_VIEWED));
    	
    	if (!json.optString(Constant.KEY_MEMO).equals(Constant.VALUE_NULL))
    		transaction.setMemo(json.optString(Constant.KEY_MEMO));
    	
    	if (!json.optString(Constant.KEY_USER_DESCRIPTION).equals(Constant.VALUE_NULL))
    		transaction.setTitle(json.optString(Constant.KEY_USER_DESCRIPTION));
    	
    	if (!json.optString(Constant.KEY_DESCRIPTION).equals(Constant.VALUE_NULL))
    		transaction.setOriginalTitle(json.optString(Constant.KEY_DESCRIPTION));
    	
    	if (!json.optString(Constant.KEY_REFERENCE).equals(Constant.VALUE_NULL))
    		transaction.setReference(json.optString(Constant.KEY_REFERENCE));
    	
    	transaction.getBusinessObjectBase().setFlags(json.optInt(Constant.KEY_FLAGS, 0));
    	
		transaction.setIsFlagged(json.optBoolean(Constant.KEY_IS_FLAGGED));
		transaction.setIsVoid(json.optBoolean(Constant.KEY_IS_VOID));
		transaction.setIsManual(json.optBoolean(Constant.KEY_IS_MANUAL));
		transaction.setIsMatched(false);
		transaction.setIsCleared(json.optBoolean(Constant.KEY_IS_CLEARED));
		transaction.setIsReimbursable(json.optBoolean(Constant.KEY_IS_REIMBURSABLE));
		transaction.setIsExcluded(json.optBoolean(Constant.KEY_IS_HIDDEN));
    	
    	JSONArray tags = json.optJSONArray(Constant.KEY_TAGS);
    	
    	if (tags != null)
    		Tag.saveArrayOfTags(tags, transaction);
    	
    	if (!json.optString(Constant.KEY_PARENT_GUID).equals(Constant.VALUE_NULL)) {
    		
    		Transactions parent = (Transactions) getObject(Transactions.class, json.optString(Constant.KEY_PARENT_GUID));
    		
    		if (parent != null) {
    			
    			transaction.setParentTransactionId(parent.getId());
    			parent.acceptChanges();
    			parent.updateBatch();
    		}
    	}
    	
    	transaction.setAmount(json.optDouble(Constant.KEY_AMOUNT));
    	transaction.setAmountReimbursable(transaction.getAmount());
    	
    	transaction.setTransactionType(json.optInt(Constant.KEY_TRANSACTION_TYPE));
    	
    	Double raw = transaction.getAmount();
    	raw *= (transaction.getTransactionType() == 1) ? -1 : 1;
    	transaction.setRawAmount(raw);
    	
    	Calendar cal = Calendar.getInstance(Locale.US);
    	cal.setTime(transaction.getDate());
    	
    	transaction.setYearNumber(cal.get(Calendar.YEAR));
    	transaction.setMonthNumber((cal.get(Calendar.MONTH) + 1));
    	transaction.setQuarterNumber(((cal.get(Calendar.MONTH) / 3) + 1));
    	transaction.setWeekNumber(cal.get(Calendar.WEEK_OF_YEAR));
    	transaction.setDayNumber(cal.get(Calendar.DAY_OF_MONTH));
    	
    	transaction.setTransactionType(json.optInt(Constant.KEY_TRANSACTION_TYPE));
    	transaction.setHasReceipt(false);
    	
    	if (json.has(Constant.KEY_CATEGORY_GUID)) {
    		
    		Category category = (Category) getObject(Category.class, json.optString(Constant.KEY_CATEGORY_GUID));
    		
    		if (category != null) {
    			
    			transaction.setCategoryId(category.getId());
    			category.acceptChanges();
    			category.updateBatch();
    		}
    	}
    	
    	transaction.acceptChanges();
    	
    	return transaction;
    }
    
    public static String topCategory() {
        SQLiteDatabase db = ApplicationContext.getDb();
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DAY_OF_YEAR, -30);
        Date start = cal.getTime();
        Date now = new Date();
        Cursor cursor = db.rawQuery(Constant.QUERY_TOP_SPENDING_CATEGORY, new String[] {
                Long.toString(start.getTime()), Long.toString(now.getTime())
        });
        cursor.moveToFirst();
        CategoryDao cat = ApplicationContext.getDaoSession().getCategoryDao();
        while (cursor.isAfterLast() == false) {
            long cat_id = cursor.getLong(0);
            Category category = cat.load(cat_id);
            if (!isCategoryIncome(category)) {
                return category.getImageName();
            }
            cursor.moveToNext();
        }
        return "S";
    }

    public static List<Double[]> get30DayExpenseTotals() {
        CategoryDao cat = ApplicationContext.getDaoSession().getCategoryDao();
        Set<Long> catIDs = new HashSet<Long>();
        List<Category> cats = cat.loadAll();
        for (int i = 0; i < cats.size(); i++) {
            if (isCategoryIncome(cats.get(i))) {
                catIDs.add(cats.get(i).getId());
            }
        }
        String SQLQuery = new String();
        Iterator<Long> iter = catIDs.iterator();
        while (iter.hasNext()) {

            SQLQuery = SQLQuery.toString() + "CATEGORY_ID != " + iter.next() + " AND ";
        }
        SQLQuery = SQLQuery.substring(0, (SQLQuery.length() - 4));
        String query = String.format(Constant.QUERY_DAILY_TRANSACTIONS, SQLQuery);
        SQLiteDatabase db = ApplicationContext.getDb();
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DAY_OF_YEAR, -30);
        Date start = cal.getTime();
        Date now = new Date();
        Cursor cursor = db.rawQuery(query, new String[] {

                Long.toString(start.getTime()), Long.toString(now.getTime())
        });
        cursor.moveToFirst();
        List<Double[]> retVal = new ArrayList<Double[]>();
        while (cursor.isAfterLast() == false) {
            Double[] d = new Double[2];
            d[0] = (double) cursor.getInt(0);
            d[1] = cursor.getDouble(1);
            retVal.add(d);
            cursor.moveToNext();
        }
        return retVal;
    }

    public static Double getExpensesTotal() {
        double retVal = 0;
        SQLiteDatabase db = ApplicationContext.getDb();
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DAY_OF_YEAR, -30);
        Date start = cal.getTime();
        Date now = new Date();
        Cursor cursor = db.rawQuery(Constant.QUERY_TOP_SPENDING_CATEGORY, new String[] {
                Long.toString(start.getTime()), Long.toString(now.getTime())
        });

        cursor.moveToFirst();
        CategoryDao cat = ApplicationContext.getDaoSession().getCategoryDao();
        while (cursor.isAfterLast() == false) {
            long cat_id = cursor.getLong(0);
            Category category = cat.load(cat_id);
            if (!isCategoryIncome(category)) {
                retVal = retVal + cursor.getLong(1);
            }
            cursor.moveToNext();
        }
        return retVal;
    }

    public static Double getIncomeTotal() {
        double retVal = 0;
        SQLiteDatabase db = ApplicationContext.getDb();
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DAY_OF_YEAR, -30);
        Date start = cal.getTime();
        Date now = new Date();
        Cursor cursor = db.rawQuery(Constant.QUERY_TOP_SPENDING_CATEGORY, new String[] {
                Long.toString(start.getTime()), Long.toString(now.getTime())
        });

        cursor.moveToFirst();
        CategoryDao cat = ApplicationContext.getDaoSession().getCategoryDao();
        while (cursor.isAfterLast() == false) {
            long cat_id = cursor.getLong(0);
            Category category = cat.load(cat_id);
            if (isCategoryIncome(category)) {
                retVal = retVal + cursor.getLong(1);
            }
            cursor.moveToNext();
        }
        return retVal;
    }

    public static int getUncategorizedTransactions() {
        int retVal = 0;
        SQLiteDatabase db = ApplicationContext.getDb();
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DAY_OF_YEAR, -30);
        Date start = cal.getTime();
        Date now = new Date();
        Cursor cursor = db.rawQuery(Constant.QUERY_DATED_TRANSACTIONS, new String[] {
                Long.toString(start.getTime()), Long.toString(now.getTime())
        });

        cursor.moveToFirst();
        TransactionsDao trans = ApplicationContext.getDaoSession().getTransactionsDao();
        while (cursor.isAfterLast() == false) {
            long cat_id = cursor.getLong(0);
            Transactions transaction = trans.load(cat_id);
            if (isTransactionUncategorized((transaction))) {
                retVal++;
            }
            cursor.moveToNext();
        }
        return retVal;
    }

    public static int getProcessedTransactions() {
        SQLiteDatabase db = ApplicationContext.getDb();
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.DAY_OF_YEAR, -30);
        Date start = cal.getTime();
        Date now = new Date();
        Cursor cursor = db.rawQuery(Constant.QUERY_UNVIEWED_TRANSACTIONS, new String[] {
                Long.toString(start.getTime()), Long.toString(now.getTime())
        });

        cursor.moveToFirst();
        CategoryDao cat = ApplicationContext.getDaoSession().getCategoryDao();
        return cursor.getInt(0);

    }

    /**
     * Performs a query to get all transactions for a given bank account.
     * The query groups the results by date and summarizes the amounts of the
     * transactions for that date.  The results are returned ordered by date
     * ascending.
     * 
     * @param bankAccountId
     * @return
     */
    @SuppressWarnings("rawtypes")
	public static List<Map> summarizedTransactions(Long bankAccountId) {
    	
    	String guid = Long.toString(bankAccountId);
    	
    	SQLiteDatabase db = ApplicationContext.getDb();
    	Cursor cursor = db.rawQuery(Constant.QUERY_SUMMED_TRANSACTIONS, new String[] { guid });
    	
    	cursor.moveToFirst();
    	
    	List<Map> list = new ArrayList<Map>();
    	
    	while (cursor.isAfterLast() == false) {
    		
    		Map<String, Object> map = new HashMap<String, Object>();
    		map.put(Constant.KEY_DATE, new Date(cursor.getLong(0)));
    		map.put(Constant.KEY_AMOUNT, Double.valueOf(cursor.getDouble(1)));
    		
    		list.add(map);
    		
    		cursor.moveToNext();
    	}
    	
    	return list;
    }
    
    
    public static Pair<Boolean, List<Transactions>> getRows(int page, String search, Date start, Date end, String orderBy, String direction) {
        
        int offset = (page - 1) * Constant.QUERY_LIMIT;
        
        if (search == null || search.equals("")) {
            search = "%";
        }
        
        return getRows(page, String.format(Constant.QUERY_DATE_TRANSACTIONS, orderBy, direction), search, search, Long.toString(start.getTime()), Long.toString(end.getTime()), Integer.toString(Constant.QUERY_LIMIT), Integer.toString(offset));
    }
    
    public static Pair<Boolean, List<Transactions>> getRows(int page, String orderBy, String direction) {

        int offset = (page - 1) * Constant.QUERY_LIMIT;
        
        return getRows(page, String.format(Constant.QUERY_TRANSACTIONS, orderBy, direction), Integer.toString(Constant.QUERY_LIMIT), Integer.toString(offset));
    }
    
    public static Pair<Boolean, List<Transactions>> getRows(PowerQuery query) {
        
        TransactionsDao dao = (TransactionsDao) DataController.getDao(Transactions.class);
        
        String queryString = query.toString();
        
        List<Transactions>transactions = dao.queryRaw(queryString, query.getSelectionArgs());
        
        boolean more = (transactions.size() == Constant.QUERY_LIMIT);
        
        return new Pair<Boolean, List<Transactions>>(more, transactions);
    }
    
    private static Pair<Boolean, List<Transactions>> getRows(int page, String query, String... selectionArgs) {
    	
    	TransactionsDao dao = (TransactionsDao) DataController.getDao(Transactions.class);
    	
    	List<Transactions> transactions = dao.queryRaw(query, selectionArgs);
    	
    	boolean more = (transactions.size() == Constant.QUERY_LIMIT);
    	
    	return new Pair<Boolean, List<Transactions>>(more, transactions);
    }
    
    public static List<Pair<String, List<Transactions>>> groupTransactions(List<Transactions> transactions) {
    	
    	List<Pair<String, List<Transactions>>> byDate = new ArrayList<Pair<String, List<Transactions>>>();

    	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
    	
    	String currentDate = sdf.format(transactions.get(0).getDate());
    	List<Transactions> tempList = new ArrayList<Transactions>();
    	boolean added = false;
    	
    	for (Transactions transaction : transactions) {
    		
    		String tempDate = sdf.format(transaction.getDate());
    		
    		if (tempDate.equals(currentDate)) {
    			
    			tempList.add(transaction);
    			added = false;
    			
    		} else {
    			
    			byDate.add(new Pair<String, List<Transactions>>(currentDate, tempList));
    			currentDate = tempDate;
    			tempList = new ArrayList<Transactions>();
    			tempList.add(transaction);
    			added = true;
    		}
    	}
    	
    	if (!added)
    		byDate.add(new Pair<String, List<Transactions>>(currentDate, tempList));
    	
    	return byDate;
    }
    
    public JSONObject getJson() throws JSONException {
    	
    	JSONObject json = new JSONObject();
    	
    	if (getTransactionId() != null)
    		json.put(Constant.KEY_GUID, getTransactionId());
    	
    	if (getBusinessObjectBase().getDataState() == DataState.DATA_STATE_DELETED.index())
    		return json;
    	
    	json.put(Constant.KEY_USER_GUID, User.getCurrentUser().getUserId());
    	
    	if (getBankAccount().getAccountId() != null)
    		json.put(Constant.KEY_ACCOUNT_GUID, getBankAccount().getAccountId());
    	
    	if (getCategory().getCategoryId() != null) {
    		
    		if (getCategory().getBusinessObjectBase().getDataStateEnum() == DataState.DATA_STATE_NEW)
    			json.put(Constant.KEY_CATEGORY_GUID, getCategory().getExternalId());
    	}
    	
    	if (getTransactionType() != null)
    		json.put(Constant.KEY_TRANSACTION_TYPE, getTransactionType());
    	
    	if (getAmount() != null)
    		json.put(Constant.KEY_AMOUNT, getAmount());
    	
    	if (getDate() != null) {
    		json.put(Constant.KEY_USER_DATE, (getDate().getTime() / 1000));
    		json.put(Constant.KEY_DATE, (getDate().getTime() / 1000));
    	}
    	
    	if (getTitle() != null)
    		json.put(Constant.KEY_USER_DESCRIPTION, getTitle());
    	
    	if (getMemo() != null)
    		json.put(Constant.KEY_MEMO, getMemo());
    	
    	if (getReference() != null)
    		json.put(Constant.KEY_REFERENCE, getReference());
    	
    	if (getIsProcessed() != null)
    		json.put(Constant.KEY_HAS_BEEN_VIEWED, getIsProcessed());
    	
    	if (getIsBusiness() != null)
    		json.put(Constant.KEY_IS_PERSONAL, getIsBusiness());
    	
    	if (getIsCleared() != null)
    		json.put(Constant.KEY_IS_CLEARED, getIsCleared());
    	
    	if (getIsFlagged() != null)
    		json.put(Constant.KEY_IS_FLAGGED, getIsFlagged());
    	
    	if (getIsVoid() != null)
    		json.put(Constant.KEY_IS_VOID, getIsVoid());
    	
    	if (getIsReimbursable() != null)
    		json.put(Constant.KEY_IS_REIMBURSABLE, getIsReimbursable());
    	
    	if (getBusinessObjectBase().getVersion() != null)
    		json.put(Constant.KEY_REVISION, getBusinessObjectBase().getVersion());
    	
    	if (getExternalId() != null)
    		json.put(Constant.KEY_EXTERNAL_ID, getExternalId());
    	
    	if (getIsManual() != null)
    		json.put(Constant.KEY_IS_MANUAL, getIsManual());
    	
    	JSONArray tags = new JSONArray();
    	
    	for (TagInstance ti : getBusinessObjectBase().getTagInstances()) {
    		tags.put(ti.getJson());
    	}
    	
    	json.put(Constant.KEY_TAGS, tags);
    	
    	return json;
    }

    public static boolean isTransactionUncategorized(Transactions t) {
        Category c = t.getCategory();
        if (c.getCategoryName().equalsIgnoreCase(Constant.UNCATEGORIZED)) {
            return true;
        }
        else {
            while (c.getParent() != null) {
                c = c.getParent();
                if (c.getCategoryName().equalsIgnoreCase(Constant.UNCATEGORIZED
                        )) {
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean isCategoryIncome(Category c) {
        if (c.getCategoryName().equalsIgnoreCase(Constant.INCOME)) {
            return true;
        }
        else {
            while (c.getParent() != null) {
                c = c.getParent();
                if (c.getCategoryName().equalsIgnoreCase(Constant.INCOME)) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean isIncome() {
    	
    	if (getCategoryId() != null) {
    		
    		Category cat = null;
    		
    		try {
    			cat = getCategory();
    		} catch (DaoException ex) {
    			cat = (Category) BusinessObject.getObject(Category.class, null, getCategoryId());
    		}
    		
    		if (cat == null)
    			return false;
    		
    		try {
	    		if (cat.getCategoryName().equalsIgnoreCase(Constant.INCOME) ||
	    				(cat.getParent() != null && cat.getParent().getCategoryName().equalsIgnoreCase(Constant.INCOME))) {
	    			return true;
	    		}
    		} catch (Exception ex) {
    			return false;
    		}
    	}
    	
    	return false;
    }
    
    public List<Tag> getTags() {
        
        TagDao tagDao = ApplicationContext.getDaoSession().getTagDao();

        PowerQuery query = new PowerQuery(tagDao);
        query.join(mTagInstance)
            .where(mBaseObjectId, Long.toString(getBusinessObjectId()));
        
        return tagDao.queryRaw(query.toString(), query.getSelectionArgs());
        
    }
    
    public String buildTagString() {
        
        StringBuilder builder = new StringBuilder();
        
        for (Tag tag : getTags()) {
            builder.append(tag.getTagName() + ", ");
        }
        
        if (builder.length() == 0) {
            return "";
        }
        
        return builder.toString().substring(0, builder.length() - 2);
    }
    // KEEP METHODS END

}
