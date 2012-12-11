package io.machinecode.intellij.ceylon.module;

import com.intellij.ide.util.projectWizard.ProjectBuilder;
import com.intellij.openapi.module.ModifiableModuleModel;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ui.configuration.ModulesProvider;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.List;

/**
 * @author Brent Douglas <brent.n.douglas@gmail.com>
 */
public class CeylonProjectBuilder extends ProjectBuilder {
    @Override
    public List<Module> commit(final Project project, @Nullable final ModifiableModuleModel model, final ModulesProvider modulesProvider) {
        return Collections.emptyList();
    }
}
