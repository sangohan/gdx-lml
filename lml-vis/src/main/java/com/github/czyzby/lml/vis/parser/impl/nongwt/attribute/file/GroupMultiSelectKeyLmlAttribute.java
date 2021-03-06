package com.github.czyzby.lml.vis.parser.impl.nongwt.attribute.file;

import com.badlogic.gdx.Input.Keys;
import com.github.czyzby.lml.parser.LmlParser;
import com.github.czyzby.lml.parser.tag.LmlAttribute;
import com.github.czyzby.lml.parser.tag.LmlTag;
import com.kotcrab.vis.ui.widget.file.FileChooser;

/** See {@link FileChooser#setGroupMultiSelectKey(int)}. Expects a key converted to string (see
 * {@link Keys#toString(int)}). Mapped to "groupMultiSelectKey".
 *
 * @author MJ */
public class GroupMultiSelectKeyLmlAttribute implements LmlAttribute<FileChooser> {
    @Override
    public Class<FileChooser> getHandledType() {
        return FileChooser.class;
    }

    @Override
    public void process(final LmlParser parser, final LmlTag tag, final FileChooser actor,
            final String rawAttributeData) {
        actor.setGroupMultiSelectKey(Keys.valueOf(parser.parseString(rawAttributeData, actor)));
    }
}
