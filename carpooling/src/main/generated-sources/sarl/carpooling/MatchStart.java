package carpooling;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Address;
import io.sarl.lang.core.Event;

@SarlSpecification("0.7")
@SarlElementType(15)
@SuppressWarnings("all")
public class MatchStart extends Event {
  @SyntheticMember
  public MatchStart() {
    super();
  }
  
  @SyntheticMember
  public MatchStart(final Address source) {
    super(source);
  }
  
  @SyntheticMember
  private final static long serialVersionUID = 588368462L;
}
