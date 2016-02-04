include_defs('//lib/maven.defs')
include_defs('//lib/JGIT_VERSION')
gerrit_plugin(
  name = 'lfs-storage-s3',
  srcs = glob(['src/main/java/**/*.java']),
  resources = glob(['src/main/resources/**/*']),
  deps = [':jgit-http-appache'],
  manifest_entries = [
    'Gerrit-PluginName: lfs-storage-s3',
    'Gerrit-Module: com.googlesource.gerrit.plugins.lfs.s3.Module',
  ],
)
maven_jar(
    name = 'jgit-http-appache',
    id = 'org.eclipse.jgit:org.eclipse.jgit.http.apache:' + VERS,
    license = 'jgit',
    repository = REPO,
    unsign = True,
)
