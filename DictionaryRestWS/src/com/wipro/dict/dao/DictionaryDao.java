package com.wipro.dict.dao;

import java.util.HashMap;
import java.util.Map;

import com.wipro.dict.bean.Dictionary;

public enum DictionaryDao {
	inst;
	
	private Map<String,Dictionary> mDictionary = new HashMap<>();
	
	private DictionaryDao()
	{
		Dictionary d1 = new Dictionary("Bank","Financial Institution");
		Dictionary d2 = new Dictionary("Cheque","Instruction to Bank");
		
		mDictionary.put(d1.getTerm(), d1);
		mDictionary.put(d2.getTerm(), d2);
	}
	
	public Map<String,Dictionary> getModel()
	{
		return mDictionary;
	}
}
