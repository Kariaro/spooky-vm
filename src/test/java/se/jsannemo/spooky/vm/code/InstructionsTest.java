package se.jsannemo.spooky.vm.code;

import static com.google.common.truth.Truth.assertThat;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;
import se.jsannemo.spooky.vm.code.Instructions.BinDef;

final class InstructionsTest {

  @Test
  void testIsExecutable() {
    assertThat(BinDef.create("test").isExecutable()).isFalse();
    assertThat(Instructions.Data.create(ImmutableList.of()).isExecutable()).isFalse();
    assertThat(Instructions.Text.create().isExecutable()).isFalse();
    assertThat(Instructions.Extern.create("name").isExecutable()).isTrue();
    assertThat(Instructions.Halt.create().isExecutable()).isTrue();
  }
}
