package org.atpfivt.jsyntrax.units.tracks.loop;

import org.atpfivt.jsyntrax.exceptions.LoopNotTwoArgsException;
import org.atpfivt.jsyntrax.units.Unit;
import org.atpfivt.jsyntrax.units.tracks.ComplexTrack;
import org.atpfivt.jsyntrax.units.tracks.Track;

import java.util.ArrayList;

public class Loop extends ComplexTrack {
  public Loop(ArrayList<Unit> units) throws LoopNotTwoArgsException {
    super(units);

    if (units.size() != 2) {
      throw new LoopNotTwoArgsException();
    }
  }

  public Track getForwardPart() {
    return (Track) getUnits().get(0);
  }

  public Track getBackwardPart() {
    return (Track) getUnits().get(1);
  }

  public boolean isForwardNull() {
    return getForwardPart() == null;
  }

  public boolean isBackwardNull() {
    return getBackwardPart() == null;
  }
}