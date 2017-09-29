package io.lsn.dao;

import io.lsn.domain.Dictionary;
import org.apache.ibatis.annotations.Param;

public interface DictionaryDao {

    Dictionary getDictionary(@Param("dictionaryName")String dictionaryName);

}
