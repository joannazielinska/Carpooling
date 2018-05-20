package carpooling;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Event;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SarlSpecification("0.7")
@SarlElementType(15)
@SuppressWarnings("all")
public class AnnounceDecision extends Event {
  public final boolean answer;
  
  public AnnounceDecision(final boolean answer) {
    this.answer = answer;
  }
  
  @Override
  @Pure
  @SyntheticMember
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    AnnounceDecision other = (AnnounceDecision) obj;
    if (other.answer != this.answer)
      return false;
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + (this.answer ? 1231 : 1237);
    return result;
  }
  
  /**
   * Returns a String representation of the AnnounceDecision event's attributes only.
   */
  @SyntheticMember
  @Pure
  protected void toString(final ToStringBuilder builder) {
    super.toString(builder);
    builder.add("answer", this.answer);
  }
  
  @SyntheticMember
  private final static long serialVersionUID = 1246337891L;
}
