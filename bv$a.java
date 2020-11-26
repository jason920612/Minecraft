import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

@FunctionalInterface
public interface a {
  void parse(StringReader paramStringReader) throws CommandSyntaxException;
}


/* Location:              F:\dw\server.jar!\bv$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */