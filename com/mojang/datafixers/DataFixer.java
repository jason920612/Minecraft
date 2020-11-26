package com.mojang.datafixers;

import com.mojang.datafixers.schemas.Schema;

public interface DataFixer {
  <T> Dynamic<T> update(DSL.TypeReference paramTypeReference, Dynamic<T> paramDynamic, int paramInt1, int paramInt2);
  
  Schema getSchema(int paramInt);
}


/* Location:              F:\dw\server.jar!\com\mojang\datafixers\DataFixer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */