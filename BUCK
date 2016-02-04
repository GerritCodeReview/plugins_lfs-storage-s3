gerrit_plugin(
  name = 'lfs-storage-s3',
  srcs = glob(['src/main/java/**/*.java']),
  resources = glob(['src/main/resources/**/*']),
  manifest_entries = [
    'Gerrit-PluginName: lfs-storage-s3',
    'Gerrit-Module: com.googlesource.gerrit.plugins.lfslocal.Module',
    'Gerrit-HttpModule: com.googlesource.gerrit.plugins.lfslocal.HttpModule',
  ],
  deps = [
    '@jgit//:jgit-lfs',
    '@jgit//:jgit-lfs-server',
  ],
)
