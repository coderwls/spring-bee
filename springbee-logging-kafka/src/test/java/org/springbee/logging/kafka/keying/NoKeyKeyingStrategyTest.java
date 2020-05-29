package org.springbee.logging.kafka.keying;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

import ch.qos.logback.classic.spi.ILoggingEvent;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

@SuppressWarnings("unchecked")
public class NoKeyKeyingStrategyTest {

  private final NoKeyKeyingStrategy unit = new NoKeyKeyingStrategy();

  @Test
  public void shouldAlwaysReturnNull() {
    assertThat(unit.createKey(Mockito.mock(ILoggingEvent.class)), is(nullValue()));
  }

}
